package com.plaxa.springstarter.aop.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student1 = new Student("Max", 3, 5.8);
        Student student2 = new Student("Jasper", 2, 5.0);
        Student student3 = new Student("Victor", 1, 8.0);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("info from method getStudents : ");
        System.out.println(students);

        return students;
    }
}
