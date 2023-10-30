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
@Profile("city")
public class TeacherConfiguration {

    @Bean
    public Teacher teacherZhang(){
        return new Teacher("张老师");
    }

    @Bean
    public Teacher teacherWong(){
        return new Teacher("王老师");
    }
}
