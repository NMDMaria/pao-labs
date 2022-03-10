package com.company.abstracts;

public abstract class AbstractClass {
    // Abstr. class with 2 fields + 2 abstr methods...
    protected String name;
    protected String type;

    public abstract String getName();
    // abstract method doesn't have a body
    public abstract String getType();

    public String getAll()
    {
        return this.getName() + " " +  this.getType();
    }
}
