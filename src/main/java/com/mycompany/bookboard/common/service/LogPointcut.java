package com.mycompany.bookboard.common.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogPointcut {
	@Pointcut("execution(* com.mycompany.bookboard..*Impl.*(..))")
	public void allPointcut() {
	}

	@Pointcut("execution(* com.mycompany.bookboard..*Impl.get*(..))")
	public void getPointcut() {
	}
}
