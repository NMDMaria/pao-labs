package com.company.compositionaggregation;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Mihai", 18);
        Student s2 = new Student("Andrei", 20);

        Student[] list = {s1, s2};
        Department dep = new Department("Info", list);

    }
}
