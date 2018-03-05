package com.cc.taxis.action;

import com.cc.taxis.dto.ReportRequestBody;
import com.cc.taxis.dto.ReportResponseBody;
import com.cc.taxis.provider.IServiceFactory;
import com.cc.taxis.utils.SpringContextUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * 统一Controller
 */
@RestController
@RequestMapping("/taxis")
public class TaxisAction {

    @Value("${taxis.rest.strategy}")
    private String strategy;

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
        return ((IServiceFactory) SpringContextUtils.getBean(strategy)).callService(serviceName, reportRequestBody);
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

}
