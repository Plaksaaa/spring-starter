package com.plaxa.springstarter.spring_introduction.container_java;

import com.plaxa.springstarter.spring_introduction.entity.Cat;
import com.plaxa.springstarter.spring_introduction.entity.Person;
import com.plaxa.springstarter.spring_introduction.entity.Pet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("com.plaxa.springstarter.spring_introduction")
public class MyConfig {
    // catBean - Bean id
    @Bean
    @Scope("singleton")
    public Cat  catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }

}
