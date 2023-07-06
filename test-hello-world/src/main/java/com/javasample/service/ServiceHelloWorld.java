package com.javasample.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.javasample.device.Device;

@Service

public class ServiceHelloWorld {

	public String serviceabc() {
		
		return "hello world";
		
	}
	
public String postServiceabc(Device dd) {
		
		return dd.devicename;
		
	}
}
