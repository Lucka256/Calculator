package cz.freelance.develop.simple.calculator;

import com.google.common.io.Resources;
import cz.freelance.develop.simple.calculator.calculator.Calculator;
import cz.freelance.develop.simple.calculator.calculator.CalculatorOperation;
import cz.freelance.develop.simple.calculator.converter.ConverterOperation;
import cz.freelance.develop.simple.calculator.converter.Converter;
import cz.freelance.develop.simple.calculator.percentage.PercentageCalculator;
import cz.freelance.develop.simple.calculator.percentage.PercentageOperation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TerminalApp {

    private static String INTRO_MESSAGE;
    private static String HELP_MESSAGE;
    private static final String INTRO_MESSAGE_FILE_PATH = "intro.txt";
    private static final String HELP_MESSAGE_FILE_PATH = "help.txt";

    private final Calculator calculator;
    private final Converter converter;
    private final PercentageCalculator percentageCalculator;

    public TerminalApp(Calculator calculator, Converter converter, PercentageCalculator percentageCalculator) throws IOException, URISyntaxException {
        this.calculator = calculator;
        this.converter = converter;
        this.percentageCalculator = percentageCalculator;

        // use google guava for load file from resource folder
        this.INTRO_MESSAGE = Resources.toString(Resources.getResource(INTRO_MESSAGE_FILE_PATH), StandardCharsets.UTF_8);
        this.HELP_MESSAGE = Resources.toString(Resources.getResource(HELP_MESSAGE_FILE_PATH), StandardCharsets.UTF_8);
    }

    public void run() throws IllegalArgumentException {

        // infinite cycle

        // read input

        // decide what is it operation

        // validate inputs field for operation

        // calculate result by method

        // print result

        // repeat

        System.out.println(INTRO_MESSAGE);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        while (true) {
            String line = readLine();

            if (line.toUpperCase().startsWith("HELP")) {
                System.out.println(HELP_MESSAGE);
                continue;
            } else if (line.toUpperCase().equals("EXIT")) {
                break;
            } else if (line.equals("")) {
                continue;
            } else if (line.startsWith(" ")) {
                System.out.println("You have writen white space before command." +
                        "\nTry write commands again.\n");
                continue;
            } else if (line.contains(",")) {
                System.out.println("You have writen ',' in numbers you need to put dot '.' insted. Try again ");
                continue;
            }

            String[] items = line.split(" "); //example {SUM 1 1} to {SUM, 1, 1}

            if (items.length < 2 | items.length > 3) {
                System.out.println("Bad command, you can use for example: SUM 1 1" +
                        "\nYou need to write commands again.\n");
                continue;
            }

            double result = 0;
            try {

                if (items.length == 3) {

                    if (items[0].toUpperCase().startsWith("PER")) {
                        final PercentageOperation operation2 = PercentageOperation.valueOf(items[0].toUpperCase());

                        final double a = Double.parseDouble(items[1]);
                        final double b = Double.parseDouble(items[2]);
                        switch (operation2) {
                            case PERXT:
                                result = percentageCalculator.calculateNumber(a, b);
                                break;
                            case PERXY:
                                result = percentageCalculator.calculatePercentage(a, b);
                                break;
                            default:
                                System.out.println("You have typed wrong first command. You need to write it again.");
                                break;
                        }
                    }

                    else {
                        final CalculatorOperation operation = CalculatorOperation.valueOf(items[0].toUpperCase()); //items[0];

                        final double a = Double.parseDouble(items[1]);
                        final double b = Double.parseDouble(items[2]);

                        switch (operation) {
                            case SUM:
                                result = calculator.sum(a, b);
                                break;
                            case SUB:
                                result = calculator.sub(a, b);
                                break;
                            case MUL:
                                result = calculator.multiply(a, b);
                                break;
                            case DIV:
                                result = calculator.division(a, b);
                                break;
                            default:
                                System.out.println("You have typed wrong first command. You need to write it again.");
                                break;
                        }
                    }
                }

            if (items.length == 2) {
                if (items[0].toUpperCase().startsWith("SQRT")) {

                    final double a = Double.parseDouble(items[1]);

                    result = calculator.squareRoot(a);
                }

                else {
                    final ConverterOperation operation1 = ConverterOperation.valueOf(items[0].toUpperCase()); //items[0];
                    final double a = Double.parseDouble(items[1]);

                    switch (operation1) {
                        case GTL:
                            result = converter.convertGalonsToLitrs(a);
                            break;
                        case CTM:
                            result = converter.convertCentimetersToMeters(a);
                            break;
                        default:
                            System.out.println("You have typed wrong first command. You need to write it again.");
                            break;
                    }
                }
            }
            System.out.println(decimalFormat.format(result));

        } catch(IllegalArgumentException exception){
            System.out.println("You have typed wrong commands.\n" + exception);
        }
    }

}

    private String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

