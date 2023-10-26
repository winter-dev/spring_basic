package org.spring.factory;

import org.springframework.beans.factory.FactoryBean;

public class ToyFactoryBean implements FactoryBean<Toy> {

    private Child child;

    public ToyFactoryBean() {
        System.out.println("ToyFactoryBean 初始化了。。。");
    }

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball": {
                return new Ball("ball");
            }
            case "car": {
                return new Car("car");
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public Class<?> getObjectType() {
        return Toy.class;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
