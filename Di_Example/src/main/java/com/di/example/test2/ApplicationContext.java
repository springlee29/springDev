package com.di.example.test2;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//스프링 설정에 사용되는 클래스임을 명시해주는 어노테이션

@Configuration
public class ApplicationContext {

	@Bean
	public MyCats2 cat1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("잠자기");
		hobbys.add("꾹꾹이");
		
		MyCats2 myCats = new MyCats2("나비", 2,hobbys);
		myCats.setWeight(2.0);
		myCats.setColor("black");
		
		return myCats;
	}
	
	@Bean
	public MyCats2 cat2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("우다다");
		hobbys.add("박치기");
		
		MyCats2 myCats = new MyCats2("혀니", 2,hobbys);
		myCats.setWeight(1.0);
		myCats.setColor("red");
		
		return myCats;
		
	}
	
	@Bean
	public Cats2 catsInfo() {
		
		Cats2 cats = new Cats2(this.cat1());
		
		return cats;
	}
}
