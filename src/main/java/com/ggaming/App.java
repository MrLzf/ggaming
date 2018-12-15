package com.ggaming;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ggaming.mapper")
@EnableTransactionManagement
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
