package org.spring.module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author kk
 * @date 2023/10/30 15:20
 * @apiNote Reception
 */
@Configuration
public class ReceptionConfiguration {

    @Bean
    @Conditional(BossCondition.class)
    public Reception conditionReception() {
        return new Reception();
    }
}
