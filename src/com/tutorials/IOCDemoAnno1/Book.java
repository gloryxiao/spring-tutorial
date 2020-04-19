package com.tutorials.IOCDemoAnno1;

import org.springframework.beans.factory.annotation.Required;

public class Book {
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
