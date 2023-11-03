package org.spring.env;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author kk
 * @date 2023/11/2 10:32
 * @apiNote
 */
public class DbApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(DbConfiguration.class);
        DbConfiguration config = app.getBean(DbConfiguration.class);
        config.printEnvi();
    }
}
