package com.company;

import com.company.exercitii.Exercitii;
import com.company.models.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Exercitii tema1 = new Exercitii();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = s.nextInt();
        tema1.ex1(n);
        System.out.println(tema1.ex3(n));
        System.out.println(tema1.ex4(n));
        int[] v = {1,3,5,6,6};
        tema1.ex5(v);
    }
}
