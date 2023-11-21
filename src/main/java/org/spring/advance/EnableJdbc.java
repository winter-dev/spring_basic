package org.spring.advance;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MysqlJdbcConfiguration.class)
public @interface EnableJdbc {
}
