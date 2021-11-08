package com.plaxa.springstarter.spring_introduction.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
    }

    /*@Autowired
    public Person(Pet pet) {
        System.out.println("person bean is created");
        this.pet = pet;
    }*/

    public void callYourPet() {
        System.out.println("Hello my lovely pet");
        pet.say();
    }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("class person set pet");
        this.pet = pet;
    }
}
