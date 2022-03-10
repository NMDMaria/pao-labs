package com.company;

import com.company.abstracts.ConcreteClass;
import com.company.immutability.Immutable;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        MyServiceEager myServiceEager = MyServiceEager.getInstance();

        ConcreteClass object = new ConcreteClass("bunny", "rodent");
        System.out.println(object.getName());
        System.out.println(object.getType());
        System.out.println(object.getAll());

        Immutable ex = new Immutable(LocalDate.now());
        LocalDate dfi = ex.getDate();
        dfi = dfi.plusDays(2);
        System.out.println(dfi);

        System.out.println(ex.getDate());
    }
}
