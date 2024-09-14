package com.codingshuttle.anuj.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	@Autowired
	Apple apple1;

	@Autowired
	private Apple apple2;

	@Autowired
	DbService dbservice;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 /*this is comment for check the
		code for DI (DB code for dbservice Class)
		apple1.eatApple();
		apple2.eatApple();
		System.out.println(apple2.hashCode());
		System.out.println(apple1.hashCode());
		apple one or two ka hashCode same hoga q ki ye ye byDefault singleton type ki bean hain
		*/
		System.out.println(dbservice.getData());
	}
}
