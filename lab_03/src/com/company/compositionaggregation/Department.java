package com.company.compositionaggregation;

public class Department {
    private String name;
    private Student[] students;

    public Department(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }
}
