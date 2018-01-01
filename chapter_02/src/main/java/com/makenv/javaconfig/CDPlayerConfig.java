package com.makenv.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    //Bean注解会告诉Spring这个方法会返回一个对象，该对象要注册为Spring应用上下文中的bean.
    //方法体中包含了最终产生bean实例的逻辑，可以用name属性为bean指定名字
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
