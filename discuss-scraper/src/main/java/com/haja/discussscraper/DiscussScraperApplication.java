package com.haja.discussscraper;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class DiscussScraperApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscussScraperApplication.class);
    }

}
