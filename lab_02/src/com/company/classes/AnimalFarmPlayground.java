package com.company.classes;

public class AnimalFarmPlayground {
    public static void main(String[] args)
    {
        // Doesnt compile after custom constr. is written
        //Animal myAnimal = new Animal();
        Animal myAniaml2 = new Animal(5);
        System.out.println(myAniaml2.getAge());

        Animal dog = new Animal(5, "Rex");
        System.out.println(dog.getAge());
        System.out.println(dog.getName());

        Cat kitty = new Cat(1, "Fishy", CatBreed.EUROPEAN);
        System.out.println(kitty.getCatBreed());
        System.out.println(kitty.getName());

        Bird duck = new Bird(0, "Donald");
        Bird pigeon = new Bird(0, "Curry");

        System.out.println();
    }
}
