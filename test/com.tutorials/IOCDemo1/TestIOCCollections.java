package com.tutorials.IOCDemo1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestIOCCollections {
    @Test
    public void testCollections() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("testCollections.xml");
        JavaCollections collections = (JavaCollections) context.getBean("collection");
        System.out.println(collections.getList());
    }
}
