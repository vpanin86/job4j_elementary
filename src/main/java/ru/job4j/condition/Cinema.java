package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("Age of customer is: " + age);
        if (age >= 18) {
            System.out.println("Welcome to Cinema!");
        } else {
            System.out.println("It's not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);
    }
}
