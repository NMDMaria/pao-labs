package com.company.strings;

public class Main {
    public static void main(String[] args) {
        String name = "Alex"; // literal
        // it gets added in string pool
        // which maintains all the strings created
        String name2 = new String("Alex");
        String name3 = "Alex";

        System.out.println(name.equals(name2)); // true
        System.out.println(name == name2); // false
        System.out.println(name == name3); // true
        // bc of string pool

        name2 = name2.intern(); // turn into string pool
        System.out.println(name == name2); // false

        // name.toUpperCase();
        // System.out.println(name);
        // Doesn't modify bc of immutability

        name = name.toUpperCase();
        System.out.println(name);

        // Good for resources when manipulating strings
        StringBuilder sb = new StringBuilder();
        sb.append("some");
        sb.append("thing");
        System.out.println(sb);

        // String buffer is thread safe
    }
}
