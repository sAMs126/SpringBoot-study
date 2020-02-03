package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A Controller Example
 *
 * @author sAMs126
 * @date 2019/12/11
 */
@RestController
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
}
