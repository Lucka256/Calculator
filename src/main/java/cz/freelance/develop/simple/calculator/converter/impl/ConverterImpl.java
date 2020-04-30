package cz.freelance.develop.simple.calculator.converter.impl;

import cz.freelance.develop.simple.calculator.converter.Converter;

public class ConverterImpl implements Converter {

    public static final double GALONS_TO_LITRS_CONVERTION_RATIO = 3.7854;
    public static final double CENTIMETRS_TO_METERS_CONVERTION_RATIO = 0.01;

    @Override
    public double convertGalonsToLitrs(double galons) {
        return galons * GALONS_TO_LITRS_CONVERTION_RATIO;
    }

    @Override
    public double convertCentimetersToMeters(double centimeters) {
        return centimeters * CENTIMETRS_TO_METERS_CONVERTION_RATIO;
    }
}
