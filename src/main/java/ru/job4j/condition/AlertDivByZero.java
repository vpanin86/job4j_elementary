package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        } else if (number < 0) {
            System.out.println("Negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(3);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-5);
    }
}
