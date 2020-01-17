package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A Controller Example
 *
 * @author sAMs126
 * @date 2020/1/16
 */
@RestController
public class Example {

	/**
	 * 日志记录器
	 */
	Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("/log")
	public String log() {
		// 日志级别
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		// Spring Boot 默认为 info 级别
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");

		return "Howdy! Check out the Logs to see the output...";
	}
}
