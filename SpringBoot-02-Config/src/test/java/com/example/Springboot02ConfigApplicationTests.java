package com.example;

import com.example.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.xml.ws.Action;

@SpringBootTest
class Springboot02ConfigApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	void contextLoads() {
	}

	@Test
	void personConfig() {
		System.out.println(person);
	}

	@Test
	void beanConfigImport() {
		boolean isExist = ioc.containsBean("exampleService");
		System.out.println(isExist);
	}
}
