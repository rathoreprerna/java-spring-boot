package com.javasample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasample.device.Device;
import com.javasample.service.ServiceHelloWorld;

@RestController

public class ControllerHelloWorld {
	@Autowired
	ServiceHelloWorld service;
	
	@GetMapping("/gethelloworld")
	public String abc() {

		return service.serviceabc();
		
	}

	@PostMapping("/posthelloworld")
	public String postabc(@RequestBody Device dd) {
		
		return service.postServiceabc(dd);
		
	}

}
