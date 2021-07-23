package com.example.sring_coreproject;

public class Student {
    private int id ;
    private String nameStudent;

    public void setId(int id) {
        this.id = id;
        System.out.println("goi phuong thuc setter : set id ");
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
        System.out.println("goi phuong thuc setter : set name ");
    }

    public Student(int id, String nameStudent) {
        this.id = id;
        this.nameStudent = nameStudent;
    }

    public Student(int id) {
        this.id = id;
    }

    public void disPlay(){
        System.out.println("ten cua sinh vien  :" + nameStudent + "\n" + "id cua sinh vien :" + id);

    }
}
