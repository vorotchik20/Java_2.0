package HomeWork7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        try{
            System.out.println("Enter the first number:");
            a = scanner.nextDouble();
            System.out.println("Enter the second number:");
            b = scanner.nextDouble();
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Не правильный формат числа");
            return;
        }
        System.out.println("Enter operation (+ or - or / or *):");
        String operation = scanner.next();
        double result = 0;
        try {
            result = calculator.calculate(a, b, operation);
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Не удалось распознать операцию");
            return;
        }
        System.out.printf("Result is: %.4f", result);
    }
}
