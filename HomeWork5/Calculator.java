package HomeWork5;

import HomeWork5.Operators.*;

public class Calculator {
    Operator operator;
    double calculate(double a, double b, String operation){
        switch (operation){
            case "+":
                operator = new SumOperator();
                break;
            case "-":
                operator = new SubOperator();
                break;
            case "/":
                operator = new DivOperator();
                break;
            case "*":
                operator = new MultOperator();
                break;
        }
        return operator.operate(a, b);
    }
}
