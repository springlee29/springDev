package com.di.example.test2;

import java.util.ArrayList;

public class MyCats2 {

	private String name;
	private int age;
	private ArrayList<String> hobbys;
	private double weight;
	private String color;
	
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
}
