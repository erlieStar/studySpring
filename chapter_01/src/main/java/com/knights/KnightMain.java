package com.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = context.getBean(Knight.class);
        //singBeforeQuest
        //Embarking on quest to slay the dragon
        //singAfterQuest
        knight.embarkOnQuest();
        context.close();
    }
}
