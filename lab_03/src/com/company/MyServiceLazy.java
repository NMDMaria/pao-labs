package com.company;

public class MyServiceLazy {
    // (A private constructor)
    // A static field containing its only instance
    // A static factory method for obtaining the instance

    //eager
    //Early instantiation
    private static MyServiceLazy instance;

    private MyServiceLazy()
    {

    }

    // Factory that returns instance
    public static MyServiceLazy getInstance()
    {
        if (instance == null) instance = new MyServiceLazy();
        return instance;
    }
}
