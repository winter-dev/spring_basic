package org.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PayloadEventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.addApplicationListener(new PayLoadListener());

        ctx.refresh();

        ctx.publishEvent("Hello World");
    }
}
