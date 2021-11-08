package com.plaxa.springstarter.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.plaxa.springstarter.aop")
@EnableAspectJAutoProxy
public class MyConfigAOP {

}
