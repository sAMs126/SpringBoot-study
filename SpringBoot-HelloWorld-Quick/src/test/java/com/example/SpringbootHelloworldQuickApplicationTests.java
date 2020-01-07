package com.example;

import com.example.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;

/**
 *  SpringBoot 的单元测试可以在运行时实现自动注入
 */
@SpringBootTest
class SpringbootHelloWorldQuickApplicationTests {

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
