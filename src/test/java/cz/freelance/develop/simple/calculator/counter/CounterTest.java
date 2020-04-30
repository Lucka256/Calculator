package cz.freelance.develop.simple.calculator.counter;

import cz.freelance.develop.simple.calculator.counter.impl.CounterImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

public class CounterTest {

    private Counter counter;

    @Before
    public void init() {
        counter = new CounterImpl();
    }

    @Test
    public void shouldGetZeroNumberWhenCreateCounter() {
        final int expectedResult = 0;
        final int actualResult = counter.getNumber();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldGetThreeNumberAfterThreeTap() {
        final int expectedResult = 3;

        IntStream.range(0, 3).forEach($ -> counter.addNumber());
        final int actualResult = counter.getNumber();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldGetFiveNumberAfterFveTap() {
        final int expectedResult = 5;

        IntStream.range(0, 5).forEach($ -> counter.addNumber());
        final int actualResult = counter.getNumber();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldGetZeroNumberAfterReset() {
        final int expectedResult = 0;

        IntStream.range(0,10).forEach($ -> counter.addNumber());
        counter.reset();
        final int actualResult = counter.getNumber();

        Assert.assertEquals(expectedResult, actualResult);
    }


}
