package cz.freelance.develop.simple.calculator.calculator.impl;

import cz.freelance.develop.simple.calculator.calculator.Calculator;
import java.lang.Math.*;

public class CalculatorImpl implements Calculator {

    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    /*
    @Override
    public double insertZero(double a) {
        return 0;
    }

    @Override
    public double insertOne(double a) {
        return 1;
    }

    @Override
    public double insertTwo(double a) {
        return 2;
    }

    @Override
    public double insertThree(double a) {
        return 3;
    }

    @Override
    public double insertFour(double a) {
        return 4;
    }

    @Override
    public double insertFive(double a) {
        return 5;
    }

    @Override
    public double insertSix(double a) {
        return 6;
    }

    @Override
    public double insertSeven(double a) {
        return 7;
    }

    @Override
    public double insertEight(double a) {
        return 8;
    }

    @Override
    public double insertNine(double a) {
        return 9;
    }

    @Override
    public void outcome (double a, double b, double o) {

       o = sum(a, b);
       o = sub(a, b);
       o = division(a, b);
       o = multiply(a, b);
    }
      */
}
