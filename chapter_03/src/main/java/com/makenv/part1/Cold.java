package com.makenv.part1;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * CONSTRUCTOR 用于描述构造器
 * FIELD 用于描述域
 * METHOD 用于描述方法
 * TYPE 用于描述类，接口（包括注解类型）或enum声明
 * RUNTIME 在运行时有效（即运行时保留）
 */
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD,
         ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Cold {
}
