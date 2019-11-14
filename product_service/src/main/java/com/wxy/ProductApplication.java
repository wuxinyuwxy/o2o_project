package com.wxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.swing.*;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication {
    //服务端
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
