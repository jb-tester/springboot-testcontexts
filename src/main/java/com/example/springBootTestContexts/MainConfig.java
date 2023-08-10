package com.example.springBootTestContexts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
    @Bean
    public BarComponent barComponent() {
        return new BarComponent("bar from main");
    }
    @Bean
    public BuzzComponent buzzComponent() {
        return new BuzzComponent();
    }
}
