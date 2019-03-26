package com.haja.discuss;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration
public class DisscussHajaApplication{
    public static void main(String[] args) {
        SpringApplication.run(DisscussHajaApplication.class);
    }
}
