package HomeWork7.Operators;

public class DivOperator implements Operator {
    @Override
    public double operate(double a, double b) {
        if (b==0){
            throw new RuntimeException("Деление на ноль невозможно");
        }
        return a/b;
    }
}
