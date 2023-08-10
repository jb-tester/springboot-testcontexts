package com.example.springBootTestContexts;

import com.example.scannedFromTests.TestOnlyComponent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ExternalTestConfig.class, loader =  AnnotationConfigContextLoader.class)
@TestPropertySource(properties = "foo.id = foo from tests")
class WithExternalExplicitConfigTest {


    @Autowired
    private FooComponent fooComponent;
    @Autowired
    private BarComponent barComponent;
    @Autowired
    private TestOnlyBean testOnlyBean;
    @Autowired
    private TestOnlyComponent testOnlyComponent;


    @Test
    void testFoo() {
        assertEquals("foo from tests", fooComponent.getId());
    }
    @Test
    void testBar() {
        assertEquals("bar from tests", barComponent.getId());
    }

    @Test
    void testTestOnlyComponent() {
        assertNotNull(testOnlyComponent);
    }
    @Test
    void testTestOnlyBean() {
        assertNotNull(testOnlyBean);
    }

}
