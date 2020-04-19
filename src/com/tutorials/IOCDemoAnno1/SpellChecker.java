package com.tutorials.IOCDemoAnno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
    private String message;

    public SpellChecker() {
        System.out.println(message + " inside spell check constructor...");
    }

    public void spellCheck() {
        System.out.println(message + " check spell !!!");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
