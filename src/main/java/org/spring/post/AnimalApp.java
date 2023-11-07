package org.spring.post;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AnimalApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext("org.spring.post");
        Arrays.stream(app.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(app.getBean(Egg.class));
    }
}
