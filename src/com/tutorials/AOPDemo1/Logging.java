package com.tutorials.AOPDemo1;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
    @Pointcut("execution(* com.tutorials.IOCDemo1.Student.getAge(..)))")
    private void ageCut() {

    }

    @Before("ageCut()")
    public void beforeAdvice() {
        System.out.println("going to setup Student profile.");
    }

    @After("ageCut()")
    public void afterAdvice() {
        System.out.println("student profile has been setup");
    }

    @AfterReturning(pointcut = "ageCut()", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning:" + retVal.toString());
    }

    @AfterThrowing(pointcut = "ageCut()", throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }

    public void aroundAdvice() {
        System.out.println("verbose: xixi...");
    }
}
