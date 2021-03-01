import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int task = scanner.nextInt();
        if (task == 1) {
            System.out.println("Enter the first number:");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double b = scanner.nextDouble();
            System.out.println("Enter operation (+ or - or / or *):");
            String operation = scanner.next();
            double result;

            switch (operation) {
                case "+":
                    result = a + b;
                    System.out.printf("Result is: %.4f", result);
                    break;
                case "-":
                    result = a - b;
                    System.out.printf("Result is: %.4f", result);
                    break;
                case "/":
                    result = a / b;
                    System.out.printf("Result is: %.4f", result);
                    break;
                case "*":
                    result = a * b;
                    System.out.printf("Result is: %.4f", result);
                    break;
                default:
                    System.out.println("operation " + operation + " is not valid.");
                    break;
            }
        }else if (task == 2){
            System.out.println("Enter the size of array:");
            int size = scanner.nextInt();
            String[] array = new String[size];
            String maxWord = "";

            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter the word:");
                array[i] = scanner.next();
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i].length() > maxWord.length()){
                    maxWord = array[i];
                }
            }
            System.out.println("Max word is: " + maxWord);
        }
    }
}
