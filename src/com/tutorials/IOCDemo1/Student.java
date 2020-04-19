package com.tutorials.IOCDemo1;

import org.springframework.beans.factory.annotation.Required;

public class Student {
    private Integer age;
    private String name = "hahaha";

    @Required
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

//    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printThrowException() {
        System.out.println("exception raised");
        throw new IllegalArgumentException("illegal arg");
    }
}
