package HomeWork5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double b = scanner.nextDouble();
        System.out.println("Enter operation (+ or - or / or *):");
        String operation = scanner.next();
        double result = calculator.calculate(a, b, operation);
        System.out.printf("Result is: %.4f", result);
    }
}
