package org.spring.module;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.stream.Stream;

/**
 * @date 2023/10/30 14:07
 * @apiNote module启动类
 */
@EnableAsync
public class ModuleApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(ModuleConfiguration.class);
        Stream.of(app.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
