package com.example.spring_coreobject_interface;

public class Student {
    private Check check;

    public void setCheck(Check check) {
        this.check = check;
    }
    public void checkSv(){
        check.Check();
    }
}
