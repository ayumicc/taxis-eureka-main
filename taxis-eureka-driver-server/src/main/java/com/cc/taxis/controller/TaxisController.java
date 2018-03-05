package com.cc.taxis.controller;

import com.cc.taxis.model.Depart;
import com.cc.taxis.service.DepartService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class TaxisController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private DepartService departService;

    @RequestMapping(value = "/service-instances" , method = RequestMethod.POST)
    public List<ServiceInstance> serviceInstancesByApplicationName(String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }

    @RequestMapping("/")
    public String sayHello() {
        return "hello";
    }

    @RequestMapping(value = "/depart/save",method = RequestMethod.POST)
    public Depart save(Integer depNo, String depName, String depMan) {
        Depart depart = new Depart(depNo, depName, depMan);
        departService.save(depart);
        return depart;
    }

    @RequestMapping(value = "/depart/findPage",method = RequestMethod.POST)
    public PageInfo<Depart> findDepartByPage(Integer pageNum , Integer pageSize){
        return departService.findDepartByPage(pageNum,pageSize);
    }

}
