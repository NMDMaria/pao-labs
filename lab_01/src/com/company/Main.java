package com.company;

import com.company.exercitii.Exercitii;
import com.company.models.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Exercitii tema1 = new Exercitii();
        System.out.println("Alegeti un ex 1-6: ");
        int opt;
        Scanner s = new Scanner(System.in);
        opt = s.nextInt();

        switch (opt)
        {
            case 1:
                tema1.ex1(); break;
            case 2:
                System.out.println("Introduceti 2 numere: ");
                int a, b;
                a = s.nextInt(); b = s.nextInt();
                System.out.println(tema1.ex2(a,b) + " este mai mare.");
                break;
            case 3:
                System.out.println(tema1.ex3()); break;
            case 4:
                System.out.println(tema1.ex4()); break;
            case 5:
                tema1.ex5(); break;
            case 6:
                tema1.ex6(); break;
            default:
                System.out.println("Optiune invalida.");
        }
    }
}
