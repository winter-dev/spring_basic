package org.spring.advance;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClassName(value = "com.mysql.jdbc.Driver")
public class MysqlJdbcConfiguration extends AbstractJdbcConfiguration{

    @Bean
    public DataSource mysqlDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        dataSource.setDriverClassName(environment.getProperty("jdbc.driver-class-name"));
        return dataSource;
    }
}
