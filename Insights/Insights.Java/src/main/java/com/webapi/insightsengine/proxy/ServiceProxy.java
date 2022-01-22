package com.webapi.insightsengine.proxy;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.Collection;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapi.mars.model.Desk;
import com.webapi.mars.model.ServiceResult;

@RestController
@FeignClient(name="TI-MARS-SERVICE")
@RibbonClient(name="TI-MARS-SERVICE")
@RequestMapping("/api/webapi/proxy")
public interface ServiceProxy {

    @GetMapping(path = "/desks", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ServiceResult<Desk[]> runDefault( );

    }
