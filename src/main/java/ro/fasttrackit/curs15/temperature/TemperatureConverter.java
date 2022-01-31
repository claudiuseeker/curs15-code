package ro.fasttrackit.curs15.temperature;

import static java.lang.Double.parseDouble;

public class TemperatureConverter {


    public static double fahrenheitToCelsius(double temperature){
        double absZeroFahr = -459.67;
        double celsiusTemp = 0;
        if(temperature>=absZeroFahr){
            celsiusTemp= (temperature-32)*5/9;
        }
        return celsiusTemp;

    }
    public static double celsiusToFahrenheit(double temperature){
        double absZeroCels= -273.15;
        double fahrenheitTemp = 0;
        if(temperature>=absZeroCels){
            fahrenheitTemp= temperature*9/5 + 32;
        }
        return fahrenheitTemp;
    }
}
