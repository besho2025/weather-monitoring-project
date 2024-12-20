
package com.mycompany.weatherapplication;
class KphToMphStrategy implements WindSpeedConversionStrategy {
    public double convert(double windSpeed) {
        return windSpeed * 0.621371; 
    }
}

class KphToKphStrategy implements WindSpeedConversionStrategy {
    public double convert(double windSpeed) {
        return windSpeed; 
    }
}