package org.spring.advance;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClassName("org.h2.Driver")
public class H2JdbcConfiguration extends AbstractJdbcConfiguration{

    @Bean
    public DataSource h2DataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        dataSource.setDriverClassName(environment.getProperty("jdbc.driver-class-name"));
        return dataSource;
    }
}
