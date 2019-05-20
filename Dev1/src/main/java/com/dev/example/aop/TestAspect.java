package com.dev.example.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect // aop 명시
@Component // bean 등록
public class TestAspect {

	//로그
	static final Logger logger = LoggerFactory.getLogger(TestAspect.class);
	
	@Pointcut("execution(* com.dev.example..controller.*.*(..))")
	private void testPointcut() {};
	
	@Around("testPointcut()")
	//어드바이스 메서드의 첫 파라미터는 반드 시 ProceedingJoinPoint타입 이어야 한다.
	public Object checkTime(ProceedingJoinPoint pjp) throws Throwable{
		
		long startTime = System.nanoTime();
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		
		logger.info("REQUEST URI : {}", request.getRequestURI());
		
		Object retVal = pjp.proceed();
		
		long endTime = System.nanoTime();
		
		logger.info("time :{}", endTime -startTime);
		
		return retVal;
	}
	
}
