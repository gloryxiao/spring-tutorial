package com.tutorials.IOCDemo1;

import com.tutorials.IOCDemoAnno1.SpellChecker;
import com.tutorials.IOCDemoAnno1.TextEditor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestTextEditor {
    @Test
    public void testTextEditor() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("testBeans.xml");
        SpellChecker checker = (SpellChecker) context.getBean("spellChecker");
//        SpellChecker checker1 = (SpellChecker) context.getBean("sp5");  // exception！inner Bean 通过直接的id无法获取
        TextEditor editor = (TextEditor) context.getBean("textEditor");
        checker.spellCheck();
        editor.getMessage();
//        editor.spellCheck();

    }
}