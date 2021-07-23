package com.example.spring_coreobject_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreObjectInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans file is loaded...");
        Student stu  = context.getBean("student" , Student.class);
        stu.mathCheat();
        AnotherStudent stu2 = context.getBean("student2" , AnotherStudent.class);
        stu2.mathcheat();
    }
}
