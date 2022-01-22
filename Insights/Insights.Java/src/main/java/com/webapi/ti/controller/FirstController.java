package com.webapi.ti.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapi.insightsengine.proxy.ServiceProxy;
import com.webapi.mars.model.Desk;
import com.webapi.mars.model.ServiceResult;


@RestController
@RequestMapping("/api/webapi")
public class FirstController {

	@Autowired
	ServiceProxy customReportServiceProxy;
	
	@GetMapping(path = "/desks", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<ServiceResult<Desk[]>> customReports(HttpServletRequest request) {

		return ResponseEntity.ok(customReportServiceProxy.runDefault());
    }
    
    }
