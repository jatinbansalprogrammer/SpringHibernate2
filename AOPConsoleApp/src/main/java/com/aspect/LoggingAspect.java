package com.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

	@Pointcut("execution(* com.service.*.*(..))")
	private void allMethodsInServicePackage() {}
	

	@Pointcut("execution(* com.service.*.get*())")
	private void gettersInServicePackage() {}

	@Pointcut("execution(* com.service.*.set*(*))")
	private void settersInServicePackage() {}

	@Pointcut("allMethodsInServicePackage() && !(gettersInServicePackage() || settersInServicePackage())")
	private void allMethodsExceptGettersSettersInServicePackage() {}

	
	
	/*
	 * @Before("allMethodsExceptGettersSettersInServicePackage()") public void
	 * before(JoinPoint joinPoint) {
	 * System.out.println("++++++++++++++++++Before Advice for Logging."); }
	 * 
	 * @AfterReturning(pointcut =
	 * "allMethodsExceptGettersSettersInServicePackage()", returning = "returing")
	 * public void afterReturning(JoinPoint joinPoint, List<String> returing) {
	 * System.out.println("++++++++++++++++++AfterReturning for Logging."); }
	 * 
	 * @AfterThrowing(pointcut = "allMethodsExceptGettersSettersInServicePackage()",
	 * throwing = "exception") public void afterThrowing(JoinPoint joinPoint,
	 * Throwable exception) {
	 * System.out.println("++++++++++++++++++AfterThrowing for Logging."); }
	 * 
	 * @After("allMethodsExceptGettersSettersInServicePackage()") public void
	 * after(JoinPoint joinPoint) {
	 * System.out.println("++++++++++++++++++After for Logging."); }
	 */
	@Around("allMethodsExceptGettersSettersInServicePackage()")
	public List<String> around(ProceedingJoinPoint proceedingjoinPoint) throws Throwable{
		System.out.println("++++++++++++++++++Around advice before for Logging.");
		long start = System.currentTimeMillis();
		try {
			proceedingjoinPoint.proceed();
		} catch (Throwable e) {
			//Logging into log file.
			//Notify DevOps team by email.
		}
		long end = System.currentTimeMillis();
		System.out.println("Milliseconds to Process: " + (end - start));
		System.out.println("++++++++++++++++++Around advice after for Logging.");
		return Arrays.asList("a");
	}
	
	
}
