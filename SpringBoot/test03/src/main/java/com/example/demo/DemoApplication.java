package com.example.demo;

import lombok.extern.java.Log;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Log
@SpringBootApplication
@ComponentScan("com.example.demo.*")
@MapperScan(basePackages = "com.example.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        log.info("我的第一个应用启动了。");
        SpringApplication.run(DemoApplication.class, args);
    }

}
