package cz.freelance.develop.simple.calculator.percentage;

import cz.freelance.develop.simple.calculator.percentage.impl.PercentageCalculatorImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PercentageTest {

    private PercentageCalculator percentageCalculator;

    @Before
    public void init() {
        percentageCalculator = new PercentageCalculatorImpl();
    }

    @Test
    public void ShouldGetZeroPointFortyAfterTaskTwoPercentageOfTwentyTotal() {

        final double percentage = 2;
        final double totalNumber = 20;
        final double expectedResult = 0.40;

        final double actualResult = percentageCalculator.calculateNumber(percentage, totalNumber);

        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    public void ShouldGetTenAfterTaskHowManyPercentIsXFromY() {

        final double number = 2;
        final double totalNumber = 20;
        final double expectedResult = 10;

        final double actualResult = percentageCalculator.calculatePercentage(number, totalNumber);

        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }
}
