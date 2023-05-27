package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divAndSubstract(double first, double second) {
        return division(first, second) + substract(first, second);
    }

    public static double allOperations(double first, double second) {
        return division(first, second) + substract(first, second) + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета divAndSubstract равен: " + divAndSubstract(10, 20));
        System.out.println("Результат расчета allOperations равен: " + allOperations(10, 20));
    }
}
