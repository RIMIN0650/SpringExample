package com.example.spring.ex.lifecycle;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class Person {

	
	// 이름과 나이를 저장
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}
