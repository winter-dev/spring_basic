package org.spring.env;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author kk
 * @date 2023/11/2 10:31
 * @apiNote
 */
@Configuration
@ComponentScan("org.spring.env")
@PropertySource(value = "classpath:jdbc.yml",factory = YmlPropertySourceFactory.class)
public class DbConfiguration {
}
