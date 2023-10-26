package org.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AnnoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        System.out.println(ctx.getBean("&toyFactory"));

        /*
        Map<String,Toy> map = ctx.getBeansOfType(Toy.class);
        map.forEach((s, toy) -> {
            System.out.println(s + "  " + toy.toString());
        });

         */
    }
}
