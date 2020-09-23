package com.kayson.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author
 * @date 2020/9/20 - 21:20
 */
public class People {
    @Autowired
    private Dog dog;
    @Autowired
    @Qualifier(value = "cat2")
    private Cat cat;
    private String name;

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }
}
