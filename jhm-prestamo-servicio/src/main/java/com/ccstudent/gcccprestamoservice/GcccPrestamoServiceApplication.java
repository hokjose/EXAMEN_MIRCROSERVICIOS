package com.ccstudent.gcccprestamoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GcccPrestamoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcccPrestamoServiceApplication.class, args);
    }

}
