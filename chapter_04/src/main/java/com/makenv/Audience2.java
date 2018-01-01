package com.makenv;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience2 {

    @Pointcut("execution(** com.makenv.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones2");
            jp.proceed();
            System.out.println("CLAP CALP!!2");
        } catch (Throwable e) {
            System.out.println("Demanding a refund2");
        }
    }
}
