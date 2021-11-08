package com.plaxa.springstarter.spring_introduction.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@NoArgsConstructor
@Data
@Component("dogBean")
@Scope("singleton")
public class Dog implements Pet {
//    private String name;

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

   /* @PostConstruct
    public void init() {
        System.out.println("Class Dog: init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy");
    }*/
}
