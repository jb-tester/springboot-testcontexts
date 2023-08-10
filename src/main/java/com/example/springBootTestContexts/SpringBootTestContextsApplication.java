package com.example.springBootTestContexts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestContextsApplication implements CommandLineRunner {

    private final UseMainBeans useMainBeans;

    public SpringBootTestContextsApplication(UseMainBeans useMainBeans) {
        this.useMainBeans = useMainBeans;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestContextsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println(useMainBeans.getId());
        System.out.println("**********************************");
    }
}
