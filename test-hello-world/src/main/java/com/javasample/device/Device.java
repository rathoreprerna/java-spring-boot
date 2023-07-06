package com.javasample.device;

import org.springframework.context.annotation.ComponentScan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Device {
	public int devicenum;
	public String devicename;

}
