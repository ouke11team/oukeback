package com.ouke.ouke;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ouke.ouke.mapper")
public class OukeApplication {

    public static void main(String[] args) {
        SpringApplication.run(OukeApplication.class, args);
    }

}
