package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * A Controller Example
 *
 * @author sAMs126
 * @date 2020/1/28
 */
@Controller
public class Example {

	@GetMapping("/hello")
	public String hello(Map<String, Object> params){
		params.put("msg", "<h1>Hello! Mike</h1>");
		params.put("toDoList", Arrays.asList("Eat", "Study", "Watch Movie"));

		return "hello";
	}
}
