package com.plaxa.springstarter.spring_introduction.runner;

import com.plaxa.springstarter.spring_introduction.entity.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContextForAnnotation.xml");

        var dogBean = context.getBean("dogBean", Dog.class);
        var dogBean1 = context.getBean("dogBean", Dog.class);

        System.out.println(dogBean == dogBean1);

        context.close();
    }
}
