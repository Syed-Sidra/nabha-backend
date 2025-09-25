package com.nabha.learning.nabhaLearning_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity  // Security enable karo
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Password hashing ke liye (Day 3 use)
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())  // CSRF disable (API ke liye safe)
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/hello", "/h2-console/**").permitAll()  // /hello aur H2 public banao
                .anyRequest().authenticated()  // Baaki sab secure (Day 3 mein adjust)
            );
        return http.build();
    }
}
