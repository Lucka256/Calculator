package cz.freelance.develop.simple.calculator.counter.impl;

import cz.freelance.develop.simple.calculator.counter.Counter;

public class CounterImpl implements Counter {

    private int number = 0;

    @Override
    public void addNumber() {
        number++;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void reset() {
        number = 0;
    }
}
