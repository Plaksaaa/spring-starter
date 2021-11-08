package com.plaxa.springstarter.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
//add
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}

}
