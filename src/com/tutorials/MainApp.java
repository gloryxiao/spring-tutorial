package com.tutorials;

import com.tutorials.IOCDemo1.HelloMessage1;
import com.tutorials.IOCDemo1.HelloWorld;
import com.tutorials.IOCDemo1.Student;
import com.tutorials.IOCDemoAnno1.SpellChecker;
import com.tutorials.IOCDemoAnno1.TextEditor;
import com.tutorials.MiscDemo.CustomEventPublisher;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");
        HelloWorld h = (HelloWorld) context.getBean("helloWorld");
        h.setMessage("haha, i change..");
        System.out.println("h:" + h.getMessage());
        System.out.println("h:" + h.getMessage1());

        HelloMessage1 hm1 = (HelloMessage1) context.getBean("helloMessage1");
        System.out.println("hm1:" + hm1.getMessage());
        System.out.println("hm1:" + hm1.getMessage1());
        System.out.println("hm1:" + hm1.getMessage2());

        System.out.println("hm1 is Object: " + hm1 instanceof Object);
        System.out.println("hm1 is HM: " + String.valueOf(hm1 instanceof HelloMessage1));
//        System.out.println("hm1 is HW: " + String.valueOf(hm1 instanceof HelloWorld));

//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("myBeans.xml"));
//        HelloWorld h1 = (HelloWorld) factory.getBean("helloWorld");
        HelloWorld h1 = (HelloWorld) context.getBean("helloWorld");
        System.out.println("h1:" + h1.getMessage());
        System.out.println(String.format("h == h1： %s", h == h1));
        context.registerShutdownHook();

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("myBeans.xml"));
        HelloWorld h2 = (HelloWorld) factory.getBean("helloWorld");
        h2.setMessage("xixi, i changed too...");
        System.out.println("h2:" + h2.getMessage());
        HelloWorld h3 = (HelloWorld) factory.getBean("helloWorld");
        System.out.println("h3: " + h3.getMessage());

        TextEditor editor = (TextEditor) context.getBean("textEditor");
//        editor.spellCheck();
        editor.getMessage();

        SpellChecker spellChecker = (SpellChecker) context.getBean("spellChecker");
        SpellChecker spellChecker1 = (SpellChecker) context.getBean("spellChecker1");
        System.out.println("s == s1: " + String.valueOf(spellChecker == spellChecker1));

        context.start();
        context.stop();
        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("cep");
        customEventPublisher.publish();

        Student student = (Student) context.getBean("student");
        System.out.println("students class name: " + student.getClass().getName());
        System.out.println("Student name" + Student.class.getName());

        System.out.println("students class super Class: " + student.getClass().getSuperclass().getName());
        System.out.println("super class for sub: " + Student.class.isAssignableFrom(student.getClass()));
//        student = new Student();
        student.setName("keke");
        student.setAge(100);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        student.printThrowException();

    }
}
