package com.example.dubbo.demo.service;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfig
@DubboComponentScan("${dubbo.component.scan}")
@SpringBootApplication
public class DubboDemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoServiceApplication.class, args);
    }

}
