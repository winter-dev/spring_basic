package org.spring.basic;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

/**
 * @author kk
 * @date 2023/10/25 16:29
 * @apiNote Aware impl
 */
public class AwareImpl implements ApplicationContextAware {

    private ApplicationContext ctx;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
    public void printBeanNames() {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
