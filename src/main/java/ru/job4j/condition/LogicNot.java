package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("Положительное? " + isPositive(2));
        System.out.println("Не положительное? " + notPositive(0));
        System.out.println("Четное? " + isEven(2));
        System.out.println("Не четное? " + notEven(5));
        System.out.println("Не четное и положительное? "
                + notEvenAndPositive(-8));
        System.out.println("Четное или не положительное? "
                + evenOrNotPositive(9));
    }
}
