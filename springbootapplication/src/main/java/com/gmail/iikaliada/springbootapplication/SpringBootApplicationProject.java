package com.gmail.iikaliada.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {
        "com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository",
        "com.gmail.iikaliada.springbootapplication.finalcontrolwork.restapi",
        "com.gmail.iikaliada.springbootapplication.finalcontrolwork.service"},
        exclude = {LiquibaseAutoConfiguration.class})
@PropertySource({"classpath:validation.properties"})
@EntityScan(basePackages = "com.gmail.iikaliada.springbootapplication.finalcontrolwork.repository.model")
public class SpringBootApplicationProject {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationProject.class, args);
    }

}
