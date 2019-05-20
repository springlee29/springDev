package com.di.example.test2;

public class Cats2 {

	private MyCats2 myCats;
	
	public Cats2(MyCats2 myCats) {
		// TODO Auto-generated constructor stub
		
		this.myCats = myCats;
	}
	
	public void getMycatsInfo() {
		System.out.println("=========================");
		System.out.println("냥이 이름 "+ myCats.getName());
		System.out.println("냥이 나이"+ myCats.getAge());
		System.out.println("냥이 취미"+ myCats.getHobbys());
		System.out.println("냥이 몸무게"+ myCats.getWeight());
		System.out.println("냥이 색"+ myCats.getColor());
		System.out.println("=========================");
	}
	
	public void setMycatsInfo(MyCats2 myCats) {
		this.myCats = myCats;
	}
}
