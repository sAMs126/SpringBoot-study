package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A Controller Example
 *
 * @author sAMs126
 * @date 2020/1/14
 */
@RestController
public class Example {

	@Value("${config-location}")
	String configLocation;

	@RequestMapping("/hello")
	public String hello() {
		return "config：" + configLocation;
	}
}
