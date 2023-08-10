package com.example.springBootTestContexts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.example.scannedFromTests")
public class ExternalTestConfig {
    @Bean
    public FooComponent fooComponent() {
        return new FooComponent();
    }

    @Bean
    public BarComponent barComponent() {
        return new BarComponent("bar from tests");
    }

    @Bean
    public TestOnlyBean testOnlyBean() {
        return new TestOnlyBean("test-only bean");
    }
}
