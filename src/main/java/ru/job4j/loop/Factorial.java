package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        int count = 1;
        for (int i = 0; i < n; i++) {
            result = result * count;
            count += 1;
        }
        return result;
    }
}
