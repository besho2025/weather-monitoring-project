package com.mycompany.weatherapplication;

class Humidity extends WeatherData {

    private Humidity(Builder builder) {
        super(builder); 
    }

    public static class Builder extends WeatherData.Builder {
        
        @Override
        public Humidity build() {
            return new Humidity(this);
        }
    }
}
