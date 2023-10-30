package org.spring.module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BossCondition {

    @Bean
    public Boss boss() {
        return new Boss();
    }
}
