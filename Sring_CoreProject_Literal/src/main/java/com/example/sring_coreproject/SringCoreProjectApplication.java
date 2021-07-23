package com.example.sring_coreproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SringCoreProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Student s1 = context.getBean("Student" , Student.class);
//        s1.disPlay();
        Student s2 = context.getBean("Quan",Student.class);
        s2.disPlay();
        Student s1 = context.getBean("Ngoc" , Student.class);
        s1.disPlay();
    }


}
