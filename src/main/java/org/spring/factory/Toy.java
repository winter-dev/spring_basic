package org.spring.factory;

public abstract class Toy {

    private final String name;

    public Toy(String name) {
        System.out.println("生产了一个" + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
