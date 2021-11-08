package com.plaxa.springstarter.aop.runner;

import com.plaxa.springstarter.aop.config.MyConfigAOP;
import com.plaxa.springstarter.aop.entity.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AfterReturningRunner {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfigAOP.class);

        var university = context.getBean("university", University.class);
        university.addStudent();
        var students = university.getStudents();
        System.out.println(students);

        context.close();
    }
}
