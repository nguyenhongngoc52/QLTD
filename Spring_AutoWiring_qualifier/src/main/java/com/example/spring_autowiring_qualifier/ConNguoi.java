package com.example.spring_autowiring_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ConNguoi {
    @Autowired
    @Qualifier("timBachTuoc")
    private Tim tim;

//    public ConNguoi() {
//    }
//
//    public ConNguoi(Tim tim) {
//        this.tim = tim;
//        System.out.println("contructor voi tham so tim dang duoc goi ... ");
//    }



//    public void setTim(Tim tim) {
//        this.tim = tim;
//        System.out.println("setter dang duoc goi....");
//    }

    public void check() {
        if (tim != null) {
            tim.timHD();
            System.out.println("Dong vat dang nghien cuu " + tim.getNameOfAnimal() + "\n" + "so qua tim cua nó là : " + tim.getSoTim());
        } else System.out.println("nguoi nay da chet");
    }

}
