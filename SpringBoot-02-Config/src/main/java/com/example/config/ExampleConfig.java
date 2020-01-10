package com.example.config;

import com.example.service.ExampleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Demo class
 *
 * @author sAMs126
 * @date 2020/01/10
 */
@Configuration
public class ExampleConfig {

	@Bean
	public ExampleService exampleService(){
		System.out.println("使用配置类向容器中注入ExampleService()");
		return new ExampleService();
	}
}
