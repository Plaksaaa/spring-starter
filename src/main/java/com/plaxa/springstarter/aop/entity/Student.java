package com.plaxa.springstarter.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String nameSurname;
    private int course;
    private Double avgGrade;

}
