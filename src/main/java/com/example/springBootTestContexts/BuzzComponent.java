package com.example.springBootTestContexts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 6/8/2023.</p>
 * <p>Project: springboot-testcontexts</p>
 * *
 */
@Component
public class BuzzComponent {
    @Value("${buzz.id}")
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
