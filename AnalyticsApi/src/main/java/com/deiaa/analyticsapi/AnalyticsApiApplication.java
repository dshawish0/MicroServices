package com.deiaa.analyticsapi;

import com.deiaa.analyticsapi.repository.AnalyticsRepository;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class AnalyticsApiApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AnalyticsApiApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8082"));

        app.run(args);
    }
}
