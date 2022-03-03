package com.company.classes;

public class Animal {
    private int age;
    private String name;

    // default constructor doesn't work once new one is written
    public Animal(int age)
    {
        this.age = age;
    }

    public Animal(int age, String name)
    {
        this(age); // call the other constructor
        // should always be the first thing called
        this.name = name;
    }

    public Animal() {
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void makeSound()
    {
        System.out.println(";(");
    }

    public void move()
    {
        System.out.println("dead");
    }
}