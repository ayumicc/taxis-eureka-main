package com.cc.taxis.client;

import com.cc.taxis.dto.ReportRequestBody;
import com.cc.taxis.dto.ReportResponseBody;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="taxis-passenger-server")
public interface TaxisPassengerClient {

    @RequestMapping(value = "/service/{serviceName}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ReportResponseBody findDepartByPage(@RequestParam("pageNum") @PathVariable("serviceName") String serviceName , @RequestBody ReportRequestBody reportRequestBody);


    @RequestMapping(value = "/service/depart/findPage", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ReportResponseBody findDepartByPage(@RequestParam("pageNum") Integer pageNum ,@RequestParam("pageSize") Integer pageSize);

}
