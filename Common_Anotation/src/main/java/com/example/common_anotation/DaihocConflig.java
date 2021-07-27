package com.example.common_anotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.common_anotation")
@PropertySource("classpath:info.properties")
public class DaihocConflig {
//    @Bean
//    public HieuTruong hieuTruong() {
//        return new HieuTruong();
//    }
//
//    public GiaoVien giaovienToan(){
//        return new GiaoVienToan();
//    }

    // tiem phu thuoc Object bang cach goi constructor
//    @Bean
//    public DaiHoc DaihocBean() {
//        return new DaiHoc(hieuTruong());
//    }
    // tiem phu thuoc bang cach goi method setter
//    @Bean
//    public DaiHoc DaihocBean() {
//        DaiHoc daihoc = new DaiHoc();
//        daihoc.setHieuTruong(hieuTruong());
//        daihoc.setGiaoVien(giaovienToan());
//        return daihoc;
//    }
}
