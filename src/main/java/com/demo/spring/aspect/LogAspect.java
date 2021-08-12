package com.demo.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public * com.demo.spring.biz..*.*(..))")
    public void defaultMethod() {
    }

//    @Pointcut("execution(public * .service..*.*(..))")
//    public void accessPgMethod() {
//    }

    @Before("defaultMethod()")
    public void beforeExecute(JoinPoint jp) {
        System.out.println("==========set mysql");
        System.out.println("before");
    }


    @After("defaultMethod()")
    public void afterAccessPg(JoinPoint jp) {
        System.out.println("after");
    }



}
