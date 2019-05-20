package com.di.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		//bean을 설정한 xml 파일이 있는 위치 지정
		String configLocation = "applicationContext.xml";
		
		//지정한 위치를 참고 하여 설정파일 얻어옴
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		//설정 파일에서 bean을 가져온다
		//getBean()를 이요해서 MyCats > myCats를 가저와 객체 생성
		//직접 생성이 아닌 외부에서 얻어옴 DI
		MyCats myCat = ctx.getBean("myCats",MyCats.class);
		
		myCat.catsNameInfo();
		myCat.catsAgeInfo();
	}
}
