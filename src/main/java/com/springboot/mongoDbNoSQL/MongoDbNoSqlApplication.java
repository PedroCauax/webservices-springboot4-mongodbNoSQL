package com.springboot.mongoDbNoSQL;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDbNoSqlApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MongoDbNoSqlApplication.class);
        app.setDefaultProperties(Map.of(
            "spring.data.mongodb.database", "workshop_mongo"
        ));
        app.run(args);
    }
}