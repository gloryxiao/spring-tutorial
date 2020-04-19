package com.tutorials.IOCDemo1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
    private String message;

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    private String message1;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void init() {
        System.out.println("inti log:" + message);
        System.out.println("init log: i am created");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("destroy log: i destroy..");
    }
}
