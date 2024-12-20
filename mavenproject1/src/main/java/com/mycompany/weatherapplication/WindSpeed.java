package com.mycompany.weatherapplication;

public class WindSpeed extends WeatherData {

    private WindSpeed(Builder builder) {
        super(builder);
    }

    public static class Builder extends WeatherData.Builder {

        @Override
        public WindSpeed build() {
            return new WindSpeed(this);
        }
    }
}
