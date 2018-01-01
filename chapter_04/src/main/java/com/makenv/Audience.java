package com.makenv;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    /*
     * 定义观众切面
     */
    @Pointcut("execution(** com.makenv.Performance.perform(..))")
    public void performance() {}

    //上面定义了performance就可以简写，否则得写成这样
    //@Before("execution(** com.makenv.Performance.perform(..))")
    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CALP!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

}
