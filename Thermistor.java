//Name:Alphonsa George
//Homework 2-Thermistor

import java.util.Scanner;

public class Thermistor
{
    private static final double TEMPERATURE_CONSTANT = 3960.0;

    private static final double ABSOLUTE_RESISTANCE = 10000.0;

    private static final double ABSOLUTE_TEMPERATURE = 298.0;

    private  static final double TEMPERATURE_SUBTRAHEND = 273.0;

    private static final double KELVIN_CONVERSION = 273.15;

    private static final double FAHRENHEIT_MULTIPLICAND = 1.8;

    private static final double FAHRENHEIT_ADDEND = 32.0;

    public static void main(String[] args)
    {
        System.out.print("Enter the resistance:");
        var scanner = new Scanner(System.in);
        var resistance = scanner.nextDouble();

        var temperature = ((TEMPERATURE_CONSTANT * ABSOLUTE_TEMPERATURE) /
                (ABSOLUTE_TEMPERATURE * Math.log (resistance / ABSOLUTE_RESISTANCE)
                        + TEMPERATURE_CONSTANT)) - TEMPERATURE_SUBTRAHEND;

        var temperature_kelvin = temperature + KELVIN_CONVERSION;

        var temperature_fahrenheit = (temperature * FAHRENHEIT_MULTIPLICAND) + FAHRENHEIT_ADDEND;

        System.out.printf(" Celsius \t\t%.2f%n Kelvin \t\t%.2f%n Fahrenheit \t%.2f%n ",
                temperature,
                temperature_kelvin,
                temperature_fahrenheit);

    }
}
