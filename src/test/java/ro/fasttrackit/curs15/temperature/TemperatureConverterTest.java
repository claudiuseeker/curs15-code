package ro.fasttrackit.curs15.temperature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TemperatureConverterTest {
   TemperatureConverter temperatureConverter;

   @BeforeEach
    public void setup(){
       temperatureConverter= new TemperatureConverter();
   }

   @Test
    @DisplayName("WHEN converting absolute zero Fahrenheit to Celsius THEN return absolute Celius value")
    void testFahrenheitToCelsiusTooLong(){
       double actual = temperatureConverter.fahrenheitToCelsius(-459.67);
       assertThat(actual).isEqualTo(-273.15);
   }
    @Test
    @DisplayName("WHEN converting 0 Fahrenheit THEN return corresponding value")
    void testZeroFahrenheit(){
        //RUN
        double actual = temperatureConverter.fahrenheitToCelsius(0);
        //ASSERT
        assertThat(temperatureConverter.fahrenheitToCelsius(0)).isEqualTo(-17.77777777777778);
    }
    @Test
    @DisplayName("WHEN converting 0 Celsius THEN return corresponding value")
    void testZeroCelsius(){
        //RUN
        double actual = temperatureConverter.celsiusToFahrenheit(0);
        //ASSERT
        assertThat(temperatureConverter.celsiusToFahrenheit(0)).isEqualTo(32);
    }

}
