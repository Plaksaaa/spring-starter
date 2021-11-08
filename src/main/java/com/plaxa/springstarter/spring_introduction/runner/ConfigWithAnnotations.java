package com.plaxa.springstarter.spring_introduction.runner;

import com.plaxa.springstarter.spring_introduction.entity.Cat;
import com.plaxa.springstarter.spring_introduction.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContextForAnnotation.xml");

//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
