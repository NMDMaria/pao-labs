package com.company.classes;

public class Cat extends Animal{
    private CatBreed catBreed;

    public Cat(int age, String name, CatBreed catBreed)
    {
        super(age, name);
        this.catBreed = catBreed;
    }

    public CatBreed getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(CatBreed catBreed) {
        this.catBreed = catBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meoww (^._.^)");
    }

    @Override
    public void move() {
        System.out.println("walk");
    }
}
