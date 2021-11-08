package com.plaxa.springstarter.spring_introduction.runner;

import com.plaxa.springstarter.spring_introduction.entity.Cat;
import com.plaxa.springstarter.spring_introduction.entity.Pet;

public class Test1 {

    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.say();
    }
}
