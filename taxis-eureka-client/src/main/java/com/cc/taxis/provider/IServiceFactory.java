package com.cc.taxis.provider;


import com.cc.taxis.dto.ReportRequestBody;
import com.cc.taxis.dto.ReportResponseBody;

public interface IServiceFactory {

    /**
     * 调用服务
     * @param serviceName 服务名
     * @param reportRequestBody 服务接口报文
     * @return
     */
    ReportResponseBody callService(String serviceName,  ReportRequestBody reportRequestBody) throws Exception;

}
