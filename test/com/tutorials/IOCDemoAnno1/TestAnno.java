package com.tutorials.IOCDemoAnno1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestAnno {
    @Test
    public void testAnnotations() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("testSpringAnnotation.xml");
        Lib lib = (Lib) context.getBean("lib");
        System.out.println(lib.getBook().getName());

    }
}
