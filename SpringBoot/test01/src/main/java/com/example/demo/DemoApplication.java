package com.example.demo;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        log.info("我的第一个应用启动了。");
        SpringApplication.run(DemoApplication.class, args);
    }

}
