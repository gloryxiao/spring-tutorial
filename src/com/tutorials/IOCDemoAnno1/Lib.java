package com.tutorials.IOCDemoAnno1;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("lib")
public class Lib {
    @Resource
    private Book book;

    public Book getBook() {
        return book;
    }
}
