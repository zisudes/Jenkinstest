package example;

import org.example.temperatureConverter;

import static org.junit.jupiter.api.Assertions.*;

class temperatureConverterTest {

    temperatureConverter temperatureConverter = new temperatureConverter();

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(0, temperatureConverter.fahrenheitToCelsius(32),0.01);
        assertEquals(100, temperatureConverter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40, temperatureConverter.fahrenheitToCelsius(-40), 0.01);
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(32, temperatureConverter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, temperatureConverter.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40, temperatureConverter.celsiusToFahrenheit(-40), 0.01);
    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertTrue( temperatureConverter.isExtremeTemperature(-41));
        assertTrue( temperatureConverter.isExtremeTemperature(51));
        assertFalse( temperatureConverter.isExtremeTemperature(-40));
        assertFalse( temperatureConverter.isExtremeTemperature(50));
    }

}