package com.example.WSD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.persistence.PersistenceContext;

@SpringBootApplication
@ImportResource("applicationContext.xml")

public class SpringhibDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringhibDemoApplication.class, args);
	}
}
