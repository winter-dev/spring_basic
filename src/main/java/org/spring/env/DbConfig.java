package org.spring.env;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author kk
 * @date 2023/11/2 10:00
 * @apiNote
 */
@Component
public class DbConfig {

    @Value("${jdbc.url}")
    private String jdbcUrl;


    @Value("${jdbc.driver-class-name}")
    private String jdbcDriver;


    @Value("${jdbc.username}")
    private String username;


    @Value("${jdbc.password}")
    private String password;

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public void setJdbcDriver(String jdbcDriver) {
        this.jdbcDriver = jdbcDriver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DbConfig{" +
                "jdbcUrl='" + jdbcUrl + '\'' +
                ", jdbcDriver='" + jdbcDriver + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
