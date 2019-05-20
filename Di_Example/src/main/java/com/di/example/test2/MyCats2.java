package com.di.example.test2;

import java.util.ArrayList;

public class MyCats2 {

	private String name;
	private int age;
	private ArrayList<String> hobbys;
	
	//생성자를 통해 필드 초기화
	public MyCats2(String name, int age, ArrayList<String> hobbys) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	
}
