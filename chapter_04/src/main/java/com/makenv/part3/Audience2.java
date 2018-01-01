package com.makenv.part3;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience2 {

    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones3");
            jp.proceed();
            System.out.println("CLAP CALP!!3");
        } catch (Throwable e) {
            System.out.println("Demanding a refund3");
        }
    }

}
