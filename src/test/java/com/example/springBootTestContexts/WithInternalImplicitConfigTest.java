package com.example.springBootTestContexts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://youtrack.jetbrains.com/issue/IDEA-322113
@ExtendWith(SpringExtension.class)
@TestPropertySource(properties = "foo.id = foo from tests 2")
class WithInternalImplicitConfigTest {

    @Autowired
    private FooComponent fooComponent;
    @Autowired
    private BarComponent barComponent;

    @Test
    void testFoo() {
        assertEquals("foo from tests 2", fooComponent.getId());
    }
    @Test
    void testBar() {
        assertEquals("bar from tests 2", barComponent.getId());
    }

    @Configuration
    static class InnerTestConfig {
        @Bean
        public FooComponent fooComponent() {
            return new FooComponent();
        }
        @Bean
        public BarComponent barComponent() {
            return new BarComponent("bar from tests 2");
        }

    }
}
