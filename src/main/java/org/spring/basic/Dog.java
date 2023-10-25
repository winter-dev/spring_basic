package org.spring.basic;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Dog {

    @Value("泰迪")
    private String name;

    private String weight;

    @Autowired
    @Qualifier(value = "lifeiyu")
    private ObjectProvider<Person> person;


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", person=" + person.getIfAvailable(Person::new) +
                '}';
    }
}
