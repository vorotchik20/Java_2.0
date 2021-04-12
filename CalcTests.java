import HomeWork7.Calculator;
import HomeWork7.Operators.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTests {
    @Test(expected = Exception.class)
    public void testDivToZero(){
        DivOperator operator = new DivOperator();
        operator.operate(4, 0);
    }

    @Test
    public void testDiv(){
        DivOperator operator = new DivOperator();
        double result;
        result = operator.operate(10, 2);
        assertEquals(5, result, 0);
        result = operator.operate(30, 2);
        assertEquals(15, result, 0);
        result = operator.operate(2, 2);
        assertEquals(1, result, 0);
    }

    @Test
    public void testMult(){
        MultOperator operator = new MultOperator();
        double result;
        result = operator.operate(60, 2);
        assertEquals(120, result, 0);
        result = operator.operate(33, 2);
        assertEquals(66, result, 0);
        result = operator.operate(2.5, 2);
        assertEquals(5, result, 0);
    }

    @Test
    public void testSub(){
        SubOperator operator = new SubOperator();
        double result;
        result = operator.operate(7, 22);
        assertEquals(-15, result, 0);
        result = operator.operate(10, 5);
        assertEquals(5, result, 0);
        result = operator.operate(2, 2);
        assertEquals(0, result, 0);
    }

    @Test
    public void testSum(){
        SumOperator operator = new SumOperator();
        double result;
        result = operator.operate(12, 22);
        assertEquals(34, result, 0);
        result = operator.operate(-10, 5);
        assertEquals(-5, result, 0);
        result = operator.operate(2, 19);
        assertEquals(21, result, 0);
    }
}
