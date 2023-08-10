package com.example.springBootTestContexts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 
@Component
public class FooComponent {

    @Value("${foo.id}")
    String id;

    public String getId() {
        return id;
    }
}
