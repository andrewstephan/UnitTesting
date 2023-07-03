import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {
    @Test
    public void checkIsPositiveTrue(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(3.5);
        Assertions.assertTrue(result, "ai dat-o in bara");

    }
    @Disabled
    @Test
    public void checkIsPositiveFalse(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(-4.5);
        Assertions.assertFalse(result);

    }

    @ParameterizedTest
    @ValueSource(doubles = {1.5,4.6,8.9,Double.MAX_VALUE})
    public void checkIsPositiveParametrized(double numberFromValues){
        IsPositive numberToCheck = new IsPositive();
        boolean result = numberToCheck.isPositive(numberFromValues);
        Assertions.assertTrue(result);

    }


    @Test
    public void checkIsNegativeTrue(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(-5);
    }
    @ParametrizedTest
    @ValueSource(int = {-3, -4, -5, -6})
    public void checkNegativeParametrized(int numberFromInt){

    }
}
