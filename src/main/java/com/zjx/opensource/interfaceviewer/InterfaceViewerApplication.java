package com.zjx.opensource.interfaceviewer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjx.opensource.interfaceviewer.mapper")
public class InterfaceViewerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterfaceViewerApplication.class, args);
    }

}

