package com.example.testspring_helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestSpringHelloWordApplication {

    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("file beans da duoc doc");
        Message message = context.getBean("test" ,Message.class);
        message.disPlay();


    }

}
