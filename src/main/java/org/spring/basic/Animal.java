package org.spring.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "org.spring.basic")
public class Animal {

    @Bean
    public Person xulaozu() {
        Person p = new Person();
        p.setName("xulaozu");
        p.setSex("男");
        p.setAge(9999);
        return p;
    }

}
