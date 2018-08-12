package com.joegabonito.taskkeeper;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@SpringBootApplication
public class TaskkeeperApplication extends SpringBootServletInitializer implements WebMvcConfigurer, ServletContextListener {

	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TaskkeeperApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(TaskkeeperApplication.class, args);
	}
	
//	@Order(Ordered.HIGHEST_PRECEDENCE)
	@Override
    public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET", "POST", "PUT", "DELETE","OPTIONS")
                .allowedHeaders("Origin","Accept","X-Requested-With","Content-Type","Authorization")
                .allowCredentials(false);
    }

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
}
