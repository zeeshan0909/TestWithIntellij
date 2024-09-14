package com.codingshuttle.anuj.week1Introduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// @Component // q ki hum dusre way se try kr rahe hain. (@Configuration main min @Beans or Factory method se).
public class Apple {
    public void eatApple(){
        System.out.println("i am eating the apple");
    }

    //life cyle ka 3 poit
    //bean initilization with help of @PostConstruct
    @PostConstruct //ye create kr k print kr dega, use se phale, create k baad
    public void initilizationAppleBeforUse(){
        System.out.println("apple is creating and ready to use");
    }

    @PreDestroy//ye bean destroy hone se phale use hoga or print kr dega
    public  void CallThismethodbefordestroythebeans(){
        System.out.println("apple use ho gaya, ab destroy kr do.");
    }
}
