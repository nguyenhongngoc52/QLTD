package com.example.spring_coreobject_injection;

public class Student {
    private int id;
    private MathCheat mathCheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void mathCheat() {
        mathCheat.matcheating();
        System.out.println("sinh vien co id :" + id + "dang gian lan ");
    }
}
