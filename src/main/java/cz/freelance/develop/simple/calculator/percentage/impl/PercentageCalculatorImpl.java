package cz.freelance.develop.simple.calculator.percentage.impl;

import cz.freelance.develop.simple.calculator.percentage.PercentageCalculator;

public class PercentageCalculatorImpl implements PercentageCalculator {

    private static final int ONE_HUNDRED_PERCENTAGE = 100;

    @Override
    public double calculateNumber(double percentage, double totalNumber) {
        return percentage * totalNumber / ONE_HUNDRED_PERCENTAGE;
    }

    @Override
    public double calculatePercentage(double number, double totalNumber) {
        return (number / totalNumber) * ONE_HUNDRED_PERCENTAGE;
    }

}
