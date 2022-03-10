package com.company;

public class MyServiceEager {
    // (A private constructor)
    // A static field containing its only instance
    // A static factory method for obtaining the instance

    //eager
    //Early instantiation
    private static MyServiceEager instance = new MyServiceEager();

    private MyServiceEager()
    {

    }

    // if we leave the access modifier as default (not public)
    // it will not be accessible from a child package

    // Factory that returns instance
    public static MyServiceEager getInstance()
    {
        return instance;
    }
}
