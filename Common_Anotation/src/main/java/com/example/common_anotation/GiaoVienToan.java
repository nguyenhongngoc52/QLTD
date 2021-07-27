package com.example.common_anotation;

import org.springframework.stereotype.Component;

@Component
public class GiaoVienToan implements GiaoVien {
    @Override
    public void info() {
        System.out.println(" toi la giao vien day toan");
        System.out.println("ten toi là Bèng béng beng");
    }
}
