package com.example;

import com.example.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ConfigApplicationTests {

	@Autowired
	Person person;

	@Test
	void contextLoads() {
	}

	@Test
	void personConfig() {
		System.out.println(person);
	}
}
