package com.cc.taxis.dto;

import java.io.Serializable;
import java.util.Map;

public class ReportRequestBody implements Serializable {

    //应用名称
    private String applicationName;

    //服务名称
    private String service;

    //请求流水号
    private String requestNo;

    //访问时间
    private String requestTime;

    //访问参数
    private Map<String , Object> requestParam;


    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        if (service != null)
            service = service.replaceAll("\\.","/");
        this.service = service;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public Map<String, Object> getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(Map<String, Object> requestParam) {
        this.requestParam = requestParam;
    }
}
