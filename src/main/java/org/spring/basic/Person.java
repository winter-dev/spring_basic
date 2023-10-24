package org.spring.basic;


import org.springframework.stereotype.Component;

@Component(value = "wangmu")
public class Person {

    private String name = "wangmu";

    private Integer age = 18;

    private String sex = "男";

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
