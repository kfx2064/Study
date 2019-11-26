package com.jth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jth.mapper")
public class Imageshop06dbconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Imageshop06dbconfigApplication.class, args);
    }

}
