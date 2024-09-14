package com.codingshuttle.anuj.week1Introduction.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name = "spring.db", havingValue = "development")
public class DevDb implements DB{

    public String getData(){
        return "Dev data";
    }
}
