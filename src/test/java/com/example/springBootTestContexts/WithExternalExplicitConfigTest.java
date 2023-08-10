package com.example.springBootTestContexts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ExternalTestConfig.class, loader =  AnnotationConfigContextLoader.class)
@TestPropertySource(properties = "foo.id = foo from tests")
class WithExternalExplicitConfigTest {


    @Autowired
    private FooComponent fooComponent;
    @Autowired
    private BarComponent barComponent;

    @Test
    void testFoo() {
        assertEquals("foo from tests", fooComponent.getId());
    }
    @Test
    void testBar() {
        assertEquals("bar from tests", barComponent.getId());
    }

}
