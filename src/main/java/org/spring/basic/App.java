package org.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("org.spring.basic");
        AwareImpl2 impl2 = ctx.getBean(AwareImpl2.class);
        impl2.printBeanNames();
    }
}
