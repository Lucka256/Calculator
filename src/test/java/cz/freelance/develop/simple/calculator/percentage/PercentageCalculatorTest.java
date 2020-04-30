package cz.freelance.develop.simple.calculator.percentage;

import cz.freelance.develop.simple.calculator.percentage.impl.PercentageCalculatorImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PercentageCalculatorTest {

    private PercentageCalculator percentageCalculator;

    @Before
    public void init() {
        percentageCalculator = new PercentageCalculatorImpl();
    }

    @Test
    public void ShouldGetFourNumberAfterCalculate_2_percentageFrom_200() {

        final double percentage = 2;
        final double totalNumber = 200;
        final double expectedResult = 4;

        final double actualResult = percentageCalculator.calculateNumber(percentage, totalNumber);

        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    public void ShouldGetTenAfterTaskHowManyPercentIs_2_From_20() {

        final double number = 2;
        final double totalNumber = 20;
        final double expectedResult = 10;

        final double actualResult = percentageCalculator.calculatePercentage(number, totalNumber);

        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }
}
