package com.example.mybatisdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisdemo2.dao")

public class Mybatisdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatisdemo2Application.class, args);
    }

}
