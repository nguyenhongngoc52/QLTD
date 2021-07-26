package com.example.spring_autowiring_qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAutoWiringQualifierApplication {

    public static void main(String[] args) {

        ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
        ConNguoi con1 = context.getBean("connguoi1" , ConNguoi.class);
        con1.check();
//        ConNguoi con2 = context.getBean("connguoi2" , ConNguoi.class);
//        con2.check();
    }

}
