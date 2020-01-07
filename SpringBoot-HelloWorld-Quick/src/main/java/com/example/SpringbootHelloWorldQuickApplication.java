package com.example;

import com.example.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author sAMs126
 * @date 2020/1/1
 */
@SpringBootApplication
public class SpringbootHelloWorldQuickApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloWorldQuickApplication.class, args);
	}

}
