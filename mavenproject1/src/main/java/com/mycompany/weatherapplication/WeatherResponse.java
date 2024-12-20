
package com.mycompany.weatherapplication;

class WeatherResponse {
    Current current;

    static class Current {
        double temp_c;
        int humidity;
        Condition condition;
        double wind_kph;

        static class Condition {
            String text;
        }
    }
}