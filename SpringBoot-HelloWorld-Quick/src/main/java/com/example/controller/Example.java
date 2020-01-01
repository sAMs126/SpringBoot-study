package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A Controller Example
 *
 * @author sAMs126
 * @date 2020/1/1
 */
@RestController
public class Example {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World Quick!";
	}
}
