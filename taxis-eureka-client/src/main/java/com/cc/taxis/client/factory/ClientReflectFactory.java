package com.cc.taxis.client.factory;

import com.cc.taxis.client.product.TaxisDriverClient;
import com.cc.taxis.client.product.TaxisPassengerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 生产出反射信息
 */
@Component
public class ClientReflectFactory implements IClientFactory {

    @Autowired
    private TaxisDriverClient taxisDriverClient;
    @Autowired
    private TaxisPassengerClient taxisPassengerClient;

    private String service;
    private Object client;
    private Class clzz;


    public Object getClient() {
        return client;
    }

    public Class getClzz() {
        return clzz;
    }

    public ClientReflectFactory designatedService(String service) {
        this.service = service;
        return this;
    }

    public ClientReflectFactory invoke() {
        switch (service) {
            case "taxis-driver-server":
                client = taxisDriverClient;
                clzz = TaxisDriverClient.class;
                break;
            case "taxis-passenger-server":
                client = taxisPassengerClient;
                clzz = TaxisPassengerClient.class;
                break;
        }
        return this;
    }
}
