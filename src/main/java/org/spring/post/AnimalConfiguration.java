package org.spring.post;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "org.spring.post")
public class AnimalConfiguration {

    @Bean
    public Dog jim() {
        return new Dog("jim");
    }

    @Bean
    public Pig peppa() {
        return new Pig("peppa");
    }

}
