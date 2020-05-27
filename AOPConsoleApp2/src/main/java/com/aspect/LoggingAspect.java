package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.entity.Customer;

//@Aspect
@Component
public class LoggingAspect {
	
	public LoggingAspect() {
		System.out.println("loggingaspect");
	}
	
	@Before("execution(* *..get*())")
	public void beforeAspect(){
		System.out.println("logging before aspect...");
	}

}
