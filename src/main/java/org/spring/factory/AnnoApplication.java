package org.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("classpath:/application.xml");
        Toy toy = ctx.getBean(Toy.class);
        System.out.println(toy);
    }
}
