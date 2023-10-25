package org.spring.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @date 2023/10/25 18:10
 * @apiNote AwareConfiguration
 */
@Configuration
public class AwareConfiguration {

    @Bean
    public AwareImpl impl() {
        return new AwareImpl();
    }
}
