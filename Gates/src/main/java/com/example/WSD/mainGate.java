package com.example.WSD;

import com.example.WSD.Service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainGate {

    public static void main(String[] args) {
        System.out.print("work");
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService testService = new TestService();
        testService.doSomething();
        int x=1;

    }
}
