package com.cc.taxis.provider;

import com.cc.taxis.client.TaxisDriverClient;
import com.cc.taxis.client.TaxisPassengerClient;
import com.cc.taxis.dto.ReportRequestBody;
import com.cc.taxis.dto.ReportResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@Component
public class FeignClientToServer implements IServiceFactory {

    @Autowired
    private TaxisDriverClient taxisDriverClient;

    @Autowired
    private TaxisPassengerClient taxisPassengerClient;


    @Override
    public ReportResponseBody callService(String serviceName, ReportRequestBody reportRequestBody) throws Exception {
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
