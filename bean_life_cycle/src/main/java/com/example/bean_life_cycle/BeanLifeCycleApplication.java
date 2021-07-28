package com.example.bean_life_cycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanLifeCycleApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        StudentDAO dao = context.getBean("StudentDAO" , StudentDAO.class);
        dao.selectAllRows();
        ((ClassPathXmlApplicationContext)context).close();
    }

}
