package com.example.scannedFromTests;

import com.example.springBootTestContexts.TestOnlyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 6/8/2023.</p>
 * <p>Project: springboot-testcontexts</p>
 * *
 */
@Component
public class TestOnlyComponent {
    final
    TestOnlyBean testOnlyBean;

    public TestOnlyComponent(TestOnlyBean testOnlyBean) {
        this.testOnlyBean = testOnlyBean;
    }

    @Override
    public String toString() {
        return "TestOnlyComponent{ " +testOnlyBean.getId() +"}";
    }
}
