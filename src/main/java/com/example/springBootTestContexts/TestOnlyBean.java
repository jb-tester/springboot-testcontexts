package com.example.springBootTestContexts;

/**
 * *
 * <p>Created by irina on 6/8/2023.</p>
 * <p>Project: springboot-testcontexts</p>
 * *
 */
public class TestOnlyBean {
    private final String id;

    public TestOnlyBean(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
