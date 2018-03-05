package com.cc.taxis.provider;

import com.cc.taxis.dto.ReportRequestBody;
import com.cc.taxis.dto.ReportResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.Map;

@Component
public class RestTemplateToServer implements IServiceFactory {

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public ReportResponseBody callService(String serviceName, ReportRequestBody reportRequestBody) throws Exception {
        return postFormForObject(serviceName , reportRequestBody);
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
}
