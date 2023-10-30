package org.spring.module;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnBeanCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attr = metadata.getAnnotationAttributes(ConditionalOnBean.class.getName());
        Class<?>[] classes = (Class<?>[]) attr.get("value");
        for (Class c : classes) {
            if (context.getBeanFactory().containsBeanDefinition(c.getName()))
                return true;
        }
        String[] beanNames = (String[]) attr.get("beanNames");
        for (String beanName : beanNames) {
            boolean match = context.getBeanFactory().containsBeanDefinition(beanName);
            return match;
        }
        return false;
    }
}
