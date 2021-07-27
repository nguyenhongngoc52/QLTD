package com.example.common_anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DaiHoc {
    @Value("${DaiHoc.name}")
    private String tenTruong ;
    @Autowired
    private HieuTruong hieuTruong;

    @Autowired
    @Qualifier("giaoVienVan")
    private GiaoVien giaoVien;

//    public DaiHoc(HieuTruong hieuTruong) {
//        this.hieuTruong = hieuTruong;
//    }

//    @Autowired
//    @Qualifier("giaoVienVan")
//    public void setGiaoVien(GiaoVien giaoVien) {
//        this.giaoVien = giaoVien;
//    }
//    @Autowired
//    public void setHieuTruong(HieuTruong hieuTruong) {
//        this.hieuTruong = hieuTruong;
//        System.out.println("setter dang duoc su dung");
//    }

    public void test(){
        System.out.println(tenTruong);
        hieuTruong.thongTin();
        giaoVien.info();
        System.out.println("Test Anotation Spring");
    }
}
