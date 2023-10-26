package org.spring.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Child child() {
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactory() {
        ToyFactoryBean bean = new ToyFactoryBean();
        bean.setChild(child());
        return bean;
    }
}
