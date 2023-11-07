package org.spring.post;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author kk
 * @date 2023/11/7 17:15
 * @apiNote muji
 */
@Component
public class Hen implements FactoryBean<Egg> {
    @Override
    public Egg getObject() throws Exception {
        return new Egg();
    }

    @Override
    public Class<?> getObjectType() {
        return Egg.class;
    }
}
