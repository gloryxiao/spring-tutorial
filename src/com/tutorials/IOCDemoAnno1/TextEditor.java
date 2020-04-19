package com.tutorials.IOCDemoAnno1;

import com.tutorials.IOCDemoAnno1.SpellChecker;

//@Component
public class TextEditor {
    private String message;

    private SpellChecker spellChecker5;

    private SpellChecker spellChecker;

    public TextEditor() {
    }

    public SpellChecker getSpellChecker5() {
        return spellChecker5;
    }

    public void setSpellChecker5(SpellChecker spellChecker5) {
        this.spellChecker5 = spellChecker5;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public String getMessage() {
        System.out.println( message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    public TextEditor(SpellChecker spellChecker) {
//        System.out.println("inside TextEditor constructor....");
//        this.spellChecker = spellChecker;
//    }

//    public void spellCheck() {
//        spellChecker.spellCheck();
//    }

}
