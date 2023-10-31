package org.spring.scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class ScanApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(ScanConfiguration.class);
        Stream.of(app.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
