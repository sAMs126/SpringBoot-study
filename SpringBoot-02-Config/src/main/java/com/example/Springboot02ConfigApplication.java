package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * config application
 *
 * @author sAMs126
 * @date 2020/01/07
 */
//@ImportResource(locations = {"classpath:bean.xml"}) // ==> 通过 @ImportResource 将 bean.xml 注入容器
@SpringBootApplication
public class Springboot02ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02ConfigApplication.class, args);
	}

}
