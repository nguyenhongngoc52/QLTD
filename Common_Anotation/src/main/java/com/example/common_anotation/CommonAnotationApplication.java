package com.example.common_anotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CommonAnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(DaihocConflig.class);
        DaiHoc daihoc = context.getBean("daiHoc" , DaiHoc.class);
        System.out.println(daihoc);
        daihoc.test();
        context.close();

    }

}
