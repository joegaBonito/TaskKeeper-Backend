package com.joegabonito.taskkeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class TaskkeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskkeeperApplication.class, args);
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	@Order(Ordered.HIGHEST_PRECEDENCE)
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000","http://localhost:3001")
                .allowedMethods("GET", "POST", "PUT", "DELETE","OPTIONS")
                .allowedHeaders("Origin","Accept","X-Requested-With","Content-Type","Authorization")
                .allowCredentials(false);
            }
        };
    }
}
