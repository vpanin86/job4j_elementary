package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        System.out.println("Максимальное число: " + result);
        return result;
    }

    public static void main(String[] args) {
        Max.max(4, 6);
    }
}
