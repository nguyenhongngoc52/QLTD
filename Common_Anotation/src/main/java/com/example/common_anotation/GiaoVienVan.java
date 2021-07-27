package com.example.common_anotation;

import org.springframework.stereotype.Component;

@Component
public class GiaoVienVan implements GiaoVien{
    @Override
    public void info() {
        System.out.println("toi la giao vien day van");
        System.out.println("ten toi la Ngoc");
    }
}
