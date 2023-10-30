package org.spring.module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author kk
 * @date 2023/10/30 14:40
 * @apiNote teacher config
 */
@Configuration
public class TeacherConfiguration {

    @Bean
    @ConditionalOnBean(beanNames = "boss")
    public Teacher teacherZhang() {
        return new Teacher("张老师");
    }

    @Bean
    @ConditionalOnBean(Boss.class)
    public Teacher teacherWong() {
        return new Teacher("王老师");
    }
}
