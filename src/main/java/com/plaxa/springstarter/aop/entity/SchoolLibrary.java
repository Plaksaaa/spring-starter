package com.plaxa.springstarter.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("we got school book");
    }
}
