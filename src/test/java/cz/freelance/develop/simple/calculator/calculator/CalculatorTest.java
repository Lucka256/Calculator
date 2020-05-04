package cz.freelance.develop.simple.calculator.calculator;

import cz.freelance.develop.simple.calculator.calculator.impl.CalculatorImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new CalculatorImpl();
    }

    @Test
    public void souldGetFourAfterSummarize_2_plus_2() {
        final double x = 2;
        final double y = 2;

        final double expectedResult = 4;
        final double actualResult = calculator.sum(x, y);

        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    public void souldGetTwoAfterSquareRoot_4() {
        final double input = 4;

        final double expectedResult = 2;
        final double actualResult = calculator.squareRoot(input);

        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    public void souldGetFourAfter_2_multiply_2() {
        final double x = 2;
        final double y = 2;

        final double expectedResult = 4;
        final double actualResult = calculator.multiply(x, y);

        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    public void souldGetTwoAfterSubstitution_4_minus_2() {
        final double x = 4;
        final double y = 2;

        final double expectedResult = 2;
        final double actualResult = calculator.sub(x, y);

        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    public void souldGetFourAfter_4_division_2() {
        final double x = 4;
        final double y = 2;

        final double expectedResult = 2;
        final double actualResult = calculator.division(x, y);

        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }
}
