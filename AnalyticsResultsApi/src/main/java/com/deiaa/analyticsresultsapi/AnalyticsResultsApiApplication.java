package com.deiaa.analyticsresultsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AnalyticsResultsApiApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AnalyticsResultsApiApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);
    }

}
