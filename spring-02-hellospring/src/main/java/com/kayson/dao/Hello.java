package com.kayson.dao;

/**
 * @author
 * @date 2020/9/20 - 13:08
 */
public class Hello {
    private String string;

    public Hello() {
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "string='" + string + '\'' +
                '}';
    }
}
