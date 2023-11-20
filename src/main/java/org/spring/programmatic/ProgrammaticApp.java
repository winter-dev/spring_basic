package org.spring.programmatic;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProgrammaticApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        BeanDefinition personDefinition = BeanDefinitionBuilder.genericBeanDefinition(Person.class)
                .addPropertyValue("name", "wangmazi").getBeanDefinition();
        ctx.registerBeanDefinition("person", personDefinition);

        BeanDefinition dogDefinition = BeanDefinitionBuilder.genericBeanDefinition(Dog.class)
                .addPropertyValue("action", "爬")
                .addPropertyReference("person", "person")
                .getBeanDefinition();
        ctx.registerBeanDefinition("dog", dogDefinition);

        ctx.refresh();

        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }
}
