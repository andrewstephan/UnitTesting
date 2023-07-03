import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll is executed");
    }

    Calculator calculator;

    @BeforeEach
    public void setUp (){
        System.out.println("Before each is executed");
        calculator = new Calculator();
    }
    @Test
    public void checkSum(){
        Calculator calculator = new Calculator();
        double result = calculator.sum(4.5, 2.3);
        Assertions.assertEquals(6.8, result, "rezultat incorect");
    }

    @Test
    public void checkMultiply(){
        Calculator calculator = new Calculator();
        double result = calculator.multiply(4.0, 3.0);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void checkModulo(){//ex 2
        double result = calculator.calculateModulo(5,2);
        Assertions.assertEquals(1,result, "checkModulo is not working");
    }
}
