package com.plaxa.springstarter.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We got uni book");
        System.out.println("______________________________________");
    }


    public void getMagazine() {
        System.out.println("We got uni magazine");
        System.out.println("______________________________________");
    }

    public void returnMagazine() {
        System.out.println("We returned uni magazine");
        System.out.println("______________________________________");
    }

    public void returnBook() {
        System.out.println("we returned uni book");
        System.out.println("______________________________________");
    }

    public void addBook(String personName, Book book) {
        System.out.println("we add uni book");
        System.out.println("______________________________________");
    }

    public void addMagazine() {
        System.out.println("we add uni magazine");
        System.out.println("______________________________________");
    }
}
