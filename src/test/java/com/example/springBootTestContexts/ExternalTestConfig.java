package com.example.springBootTestContexts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ExternalTestConfig {
    @Bean
    public FooComponent fooComponent() {
        return new FooComponent();
    }

    @Bean
    public BarComponent barComponent() {
        return new BarComponent("bar from tests");
    }


}
