package cz.freelance.develop.simple.calculator;

import cz.freelance.develop.simple.calculator.calculator.Calculator;
import cz.freelance.develop.simple.calculator.calculator.impl.CalculatorImpl;
import cz.freelance.develop.simple.calculator.converter.Converter;
import cz.freelance.develop.simple.calculator.converter.impl.ConverterImpl;
import cz.freelance.develop.simple.calculator.percentage.PercentageCalculator;
import cz.freelance.develop.simple.calculator.percentage.impl.PercentageCalculatorImpl;

import java.io.IOException;
import java.net.URISyntaxException;

public class App {

    public static void main(String args[])

    {
        final Calculator calculator = new CalculatorImpl();
        final Converter converter = new ConverterImpl();
        final PercentageCalculator percentageCalculator = new PercentageCalculatorImpl();

        final TerminalApp terminalApp;

        try {
            terminalApp = new TerminalApp(calculator, converter, percentageCalculator);
            terminalApp.run();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

    }

}
