package com.dyer.frameworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.dyer.frameworks")
public class Application {
    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}