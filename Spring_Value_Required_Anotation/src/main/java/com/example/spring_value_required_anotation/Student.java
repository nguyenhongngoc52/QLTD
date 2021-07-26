package com.example.spring_value_required_anotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.intrestedCourse}")
    private String intrestedCourse;
    @Value("${student.hobby}")
    private String hobby;

  //  @Value("${student.name}")
//    public void setName(String name) {
//        this.name = name;
//        System.out.println("goi den ham set Name");
//    }

//    @Value("${student.intrestedCourse}")
//    public void setIntrestedCourse(String intrestedCourse) {
//        this.intrestedCourse = intrestedCourse;
//        System.out.println(" goi den ham set Course");
//    }

//    @Value("${student.hobby}")
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//        System.out.println("goi den ham set hobby");
//    }

    public void disPlayStudent() {
        System.out.println("Student name : " + name);
        System.out.println("Student intrested Course : " + intrestedCourse);
        System.out.println("Student hobby : " + hobby);
    }
}
