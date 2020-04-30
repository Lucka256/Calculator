package cz.freelance.develop.simple.calculator.converter;

import cz.freelance.develop.simple.calculator.converter.impl.ConverterImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConverterTest {

    private Converter converter;

    @Before
    public void init() {
        converter = new ConverterImpl();
    }

    @Test
    public void shouldGetTwentyGalonsAfterConvertionOfFivePointThreeLitrs() {
        final double input = 5.3;
        final double expectedResult = 20;

        final double actualResult = converter.convertGalonsToLitrs(input);

        Assert.assertEquals(expectedResult,actualResult, 0.1);
    }

    @Test
    public void shouldGetZeroPointZeroFiveThreeMetersAfterConvertionOfFivePointThreeCentimetrs() {
        final double input = 5.3;
        final double expectedResult = 0.053;

        final double actualResult = converter.convertCentimetersToMeters(input);

        Assert.assertEquals(expectedResult,actualResult, 0.1);
    }
}
