package com.company.exercitii;

public class Exercitii {
    public Exercitii() {
    }

    public void ex1(int n)
    {
       int i = 0;
       while (i <= n)
       {
           System.out.print(i + " ");
           i += 2;
       }
       System.out.println();
    }

    public int ex2(int a, int b)
    {
        if (a > b) {
            return a;
        } else return b;
    }

    public long ex3(int n)
    {
        long rez = 1;
        while (n > 1)
        {
            rez *= n;
            n--;
        }
        return rez;
    }

    public int ex4(int n)
    {
        int sum = 0;

        for (int i = 1; 3*i <=n || 5*i<=n; ++i)
        {
            if (3*i <= n) sum += 3*i;
            if (5*i <= n) sum += 5*i;
        }
        return sum;
    }

    public void ex5(int[] v)
    {


    }
}
