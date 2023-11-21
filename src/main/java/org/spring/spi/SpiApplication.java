package org.spring.spi;

import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

public class SpiApplication {

    public static void main(String[] args) {
        List<FeverDao> list = SpringFactoriesLoader.loadFactories(FeverDao.class, SpiApplication.class.getClassLoader());
        list.forEach(System.out::println);

        System.out.println("================================");
        List<String> classList = SpringFactoriesLoader.loadFactoryNames(FeverDao.class, SpiApplication.class.getClassLoader());
        classList.forEach(System.out::println);
    }
}
