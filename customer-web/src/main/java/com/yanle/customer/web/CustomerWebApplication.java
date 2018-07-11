package com.yanle.customer.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = "com.yanle.customer")
@EnableDubboConfiguration
public class CustomerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerWebApplication.class, args);
    }
}
