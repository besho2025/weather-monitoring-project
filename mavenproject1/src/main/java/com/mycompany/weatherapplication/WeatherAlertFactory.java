
package com.mycompany.weatherapplication;

public class WeatherAlertFactory {

    public static WeatherAlert createAlert(String condition) {
        if (condition.equalsIgnoreCase("storm")) {
            return new StormAlert();
        } else if (condition.equalsIgnoreCase("heatwave")) {
            return new HeatwaveAlert();
        } else if (condition.equalsIgnoreCase("snow")) {
            return new SnowAlert();
        } else {
            return new GeneralAlert();
        }
    }
}