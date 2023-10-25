package org.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("org.spring.basic");
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog.toString());
    }
}
