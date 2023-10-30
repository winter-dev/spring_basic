package org.spring.module;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @date 2023/10/30 14:15
 * @apiNote anno
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class,TeacherConfiguration.class,ReceptionImportSelector.class})
public @interface EnableModule {
}
