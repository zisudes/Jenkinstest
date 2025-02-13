package org.example;

public class temperatureConverter {
    public  static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32)/1.8;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
    public static boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
}
