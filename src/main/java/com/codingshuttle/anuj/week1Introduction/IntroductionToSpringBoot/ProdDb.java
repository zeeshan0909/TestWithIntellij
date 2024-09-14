package com.codingshuttle.anuj.week1Introduction.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "spring.db", havingValue = "Production")
public class ProdDb implements DB{

    public String getData(){
        return "prod data";
    }
}
