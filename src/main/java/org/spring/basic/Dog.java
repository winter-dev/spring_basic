package org.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Component
public class Dog {

    @Value("泰迪")
    private String name;

    private String weight;

    @Resource(name = "xulaozu")
    private Person person;



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", person=" + person +
                '}';
    }
}
