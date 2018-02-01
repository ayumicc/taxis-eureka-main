package com.cc.taxis.action;

import com.cc.taxis.api.TaxisDriverClient;
import com.cc.taxis.api.TaxisPassengerClient;
import com.cc.taxis.dto.ReportRequestBody;
import com.cc.taxis.dto.ReportResponseBody;
import com.cc.taxis.utils.AopTargetUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Iterator;
import java.util.Map;

/**
 * 统一Controller
 */
@RestController
@RequestMapping("/taxis")
public class TaxisAction {

    @Value("${taxis.rest.strategy}")
    private String strategy;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TaxisDriverClient taxisDriverClient;

    @Autowired
    private TaxisPassengerClient taxisPassengerClient;


    /**
     * 打车统一服务
     *
     * @param reportRequestBody
     * @return
     */
    @RequestMapping(value = "/service/{serviceName}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "serviceError")
    public ReportResponseBody service(@PathVariable("serviceName") String serviceName,
                                      @RequestBody ReportRequestBody reportRequestBody) throws Exception {
        if (serviceName == null)
            return null;
        if (reportRequestBody == null)
            return null;
        if (reportRequestBody.getService() == null)
            return null;
        serviceName = serviceName.replaceAll("-", "/");
        if ("feign".equalsIgnoreCase(strategy))
            return callService(serviceName, reportRequestBody);
        else
            return postFormForObject(serviceName, reportRequestBody);
    }

    /**
     * 熔断方法
     *
     * @param serviceName
     * @param reportRequestBody
     * @return
     */
    public ReportResponseBody serviceError(String serviceName, ReportRequestBody reportRequestBody) {
        return ReportResponseBody.failedResult(-1, "【" + serviceName + "】服务超时无法访问.");
    }

    private ReportResponseBody postFormForObject(String serviceName, ReportRequestBody reportRequestBody) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        return postForObject(serviceName, reportRequestBody, headers);
    }

    private ReportResponseBody postJsonForObject(String serviceName, ReportRequestBody reportRequestBody) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return postForObject(serviceName, reportRequestBody, headers);
    }

    private ReportResponseBody postForObject(String serviceName, ReportRequestBody reportRequestBody, HttpHeaders headers) {
        MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<>();
        if (reportRequestBody.getRequestParam() != null) {
            Iterator<Map.Entry<String, Object>> iterator = reportRequestBody
                    .getRequestParam().entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Object> entry = iterator.next();
                multiValueMap.add(entry.getKey(), entry.getValue());
            }
        }
        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(multiValueMap, headers);
        Object o = this.restTemplate
                .postForObject("http://" + reportRequestBody.getService() + "/service/" + serviceName, requestEntity, Object.class);
        return !(o instanceof ReportResponseBody) ? ReportResponseBody.succeeResult(o) : (ReportResponseBody) o;
    }

    private ReportResponseBody callService(String serviceName, ReportRequestBody reportRequestBody) throws Exception {
        Object client = null;
        Class clzz = null;
        switch (reportRequestBody.getService()) {
            case "taxis-driver-server":
                client = taxisDriverClient;
                clzz = TaxisDriverClient.class;
                break;
            case "taxis-passenger-server":
                client = taxisPassengerClient;
                clzz = TaxisPassengerClient.class;
                break;
        }

        //TODO:不支持重载
        Object[] param = null;
        String methodName = null;
        for (Method service : clzz.getDeclaredMethods()) {
            RequestMapping requestMapping = service.getDeclaredAnnotation(RequestMapping.class);
            if (requestMapping.value()[0].equals("/service/" + serviceName)) {
                if (reportRequestBody.getRequestParam() != null) { //参数配置
                    param = new Object[service.getParameterCount()];
                    int count = 0;
                    for (Parameter parameter : service.getParameters()) {
                        RequestParam requestParam = parameter.getAnnotation(RequestParam.class);
                        param[count] = reportRequestBody.getRequestParam().get(requestParam.value());
                        count++;
                    }
                }
                methodName = service.getName();
                break;
            }
        }

        for (Method service : client.getClass().getDeclaredMethods()) {
            if (service.getName().equals(methodName)) {
                Object o = service.invoke(client, param);
                return !(o instanceof ReportResponseBody) ? ReportResponseBody.succeeResult(o) : (ReportResponseBody) o;
            }
        }
        return ReportResponseBody.failedResult(-1, "【" + serviceName + "】无对应服务.");
    }

}
