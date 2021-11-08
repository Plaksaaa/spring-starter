package com.plaxa.springstarter.spring_introduction.container_java;

import com.plaxa.springstarter.spring_introduction.entity.Cat;
import com.plaxa.springstarter.spring_introduction.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContainerJavaTest {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfig.class);

        var catBean = context.getBean("catBean", Cat.class);
        var catBean1 = context.getBean("catBean", Cat.class);
//        catBean.say();

        var personBean = context.getBean("personBean", Person.class);
        personBean.callYourPet();
        System.out.println(personBean.getSurname());

        context.close();
    }
}
