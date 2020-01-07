package com.example.bean;

/**
 * 测试配置文件
 *
 * @author sAMs126
 * @date 2020/01/06
 */
public class Pet {
	private String name;

	private Integer age;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Pet{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
