package com.microsoft.demo;

public class Demo {
    public void doSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }
        System.out.println("I am not covered");
    }

}