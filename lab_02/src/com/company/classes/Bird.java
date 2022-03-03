package com.company.classes;

public class Bird extends Animal{
    public Bird(int age, String name) {
        super(age, name);
    }

    @Override
    public boolean equals(Object obj) {
        Bird other = (Bird) obj;
        return this.getAge() == other.getAge() && this.getName().equals(other.getName());
    }

    @Override
    public String toString() {
        return "Bird name is " +  this.getName() + " and age " + this.getAge();
    }

    @Override
    public void makeSound() {
        System.out.println("cip cirip");
    }

    @Override
    public void move() {
        System.out.println("flies");
    }
}
