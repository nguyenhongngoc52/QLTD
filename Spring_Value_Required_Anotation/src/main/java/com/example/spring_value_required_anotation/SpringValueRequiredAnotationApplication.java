package com.example.spring_value_required_anotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringValueRequiredAnotationApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("file beans.xml da duoc doc...");
        Student stu = context.getBean("student" , Student.class);
        System.out.println(stu);
        stu.disPlayStudent();
    }

}
