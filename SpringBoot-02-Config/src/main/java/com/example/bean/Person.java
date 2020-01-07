package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 测试配置文件属性
 *
 * @author sAMs126
 * @date 2020/01/06
 */
@Component
@ConfigurationProperties(prefix = "person" )
public class Person {
//	@Value("${person.last-name}")
	private String lastName;
//	@Value("#{11*2}")
	private Integer age;
//	@Value("true")
	private Boolean boss;
	private Date bDay;

	private Map<String, Object> maps;
	private List<Object> list;
	private Pet pet;

	@Override
	public String toString() {
		return "Person{" +
				"lastName='" + lastName + '\'' +
				", age=" + age +
				", boss=" + boss +
				", bDay=" + bDay +
				", maps=" + maps +
				", list=" + list +
				", pet=" + pet +
				'}';
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}

	public Date getbDay() {
		return bDay;
	}

	public void setbDay(Date bDay) {
		this.bDay = bDay;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
}
