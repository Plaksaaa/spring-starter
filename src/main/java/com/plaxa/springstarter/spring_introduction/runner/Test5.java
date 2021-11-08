package com.plaxa.springstarter.spring_introduction.runner;

import com.plaxa.springstarter.spring_introduction.entity.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();

        Dog Pdog = context.getBean("myPet", Dog.class);
        dog.say();

        context.close();
    }
}
