package org.spring.module;

/**
 * @author kk
 * @date 2023/10/30 14:38
 * @apiNote teacher
 */
public class Teacher {
    public Teacher(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
