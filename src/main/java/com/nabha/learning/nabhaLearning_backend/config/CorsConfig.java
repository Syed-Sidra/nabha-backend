package com.nabha.learning.nabhaLearning_backend.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration  // Spring Boot ko yeh config load karne ko bolo
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // Saare endpoints pe CORS apply (e.g., /api/users/register)
                        .allowedOrigins("http://localhost:5500", "http://localhost:3000", "http://127.0.0.1:5500")  // Aapke frontend Live Server ports
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // API methods allow
                        .allowedHeaders("*")  // Headers jaise Content-Type, Authorization (token ke liye)
                        .allowCredentials(true);  // Cookies/token with credentials
            }
        };
    }
}
