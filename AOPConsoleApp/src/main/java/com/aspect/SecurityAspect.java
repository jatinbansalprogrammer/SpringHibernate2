package com.aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Aspect
@Component
@Order(1)
public class SecurityAspect {

	
	
	@Before("execution(* com.service.*.*(..))")
	public void before() {
		System.out.println("++++++++++++++++++Before Advice for Security");
		
	}
	
	
	
}
