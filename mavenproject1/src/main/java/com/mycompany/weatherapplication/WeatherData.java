package com.mycompany.weatherapplication;

public abstract class WeatherData {
    protected double value;
    protected String unit;  

   
    protected WeatherData(Builder builder) {
        this.value = builder.value;
        this.unit = builder.unit;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public static abstract class Builder {
        protected double value;
        protected String unit;

        public Builder setValue(double value) {
            this.value = value;
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = unit;
            return this;
        }

        public abstract WeatherData build();
    }
}
