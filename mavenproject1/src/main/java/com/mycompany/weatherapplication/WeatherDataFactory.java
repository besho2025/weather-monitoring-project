package com.mycompany.weatherapplication;

public class WeatherDataFactory {

    public static WeatherData createWeatherData(String type, double value, String unit) {
        if (type.equalsIgnoreCase("Temperature")) {
            return new Temperature.Builder()
                .setValue(value)
                .setUnit(unit)
                .build();
        } else if (type.equalsIgnoreCase("Humidity")) {
            return new Humidity.Builder()
                .setValue(value)
                .setUnit(unit)
                .build();
        } else if (type.equalsIgnoreCase("WindSpeed")) {
            return new WindSpeed.Builder()
                .setValue(value)
                .setUnit(unit)
                .build();
        } else {
            throw new IllegalArgumentException("Invalid weather data type: " + type);
        }
    }
}
