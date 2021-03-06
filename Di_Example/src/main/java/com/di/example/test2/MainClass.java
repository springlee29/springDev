package com.di.example.test2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.di.example.test1.Cats;

public class MainClass {

	public static void main(String[] args) {
		
//		String configLocation = "classpath:applicationContext.xml";
//		
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
//		
//		Cats2 catsInfo = ctx.getBean("catsInfo",Cats2.class);
//		
//		catsInfo.getMycatsInfo();
//	
//		MyCats2 myCats = ctx.getBean("cat2",MyCats2.class);
//		
//		catsInfo.setMycatsInfo(myCats);
//		
//		catsInfo.getMycatsInfo();
//		ctx.close();
		
		//어노테이션을 이용해 bean을 설정 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		Cats2 cats = ctx.getBean("catsInfo",Cats2.class);
		
		cats.getMycatsInfo();
		
		MyCats2 myCats = ctx.getBean("cat2",MyCats2.class);
		
		cats.setMycatsInfo(myCats);
		cats.getMycatsInfo();
	}
}
