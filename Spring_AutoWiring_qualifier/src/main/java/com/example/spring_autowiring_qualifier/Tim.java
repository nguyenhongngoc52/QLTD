package com.example.spring_autowiring_qualifier;

public class Tim {
    private int soTim;
    private String nameOfAnimal ;
    public void timHD(){
        System.out.println("Tim dang hoat dong");
        System.out.println("nguoi con song");
    }

    public int getSoTim() {
        return soTim;
    }

    public void setSoTim(int soTim) {
        this.soTim = soTim;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }
}
