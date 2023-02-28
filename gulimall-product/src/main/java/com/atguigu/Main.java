package com.atguigu;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}