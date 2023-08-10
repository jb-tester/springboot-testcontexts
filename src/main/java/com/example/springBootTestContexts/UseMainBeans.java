package com.example.springBootTestContexts;

import org.springframework.stereotype.Component;


@Component
public class UseMainBeans {

    private final FooComponent fooComponent;
    private final BarComponent barComponent;
    private final BuzzComponent buzzComponent;

   // here:
   // fooComponent is scanned as @Component in src, and defined as method in tests: false error
    // barComponent is defined as method both in src and tests: ok
    // buzzComponent is scanned as @Component and defined as method in src only: no errors shown, but should
    public UseMainBeans(FooComponent fooComponent, BarComponent barComponent, BuzzComponent buzzComponent) {
        this.fooComponent = fooComponent;
        this.barComponent = barComponent;
        this.buzzComponent = buzzComponent;
    }

    public String getId() {
        return "use components: "+fooComponent.getId() + ", " + barComponent.getId() + ", " + buzzComponent.getId();
    }
}
