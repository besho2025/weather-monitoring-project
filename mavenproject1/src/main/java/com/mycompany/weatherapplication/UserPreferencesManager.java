package com.mycompany.weatherapplication;

public class UserPreferencesManager {
    private static UserPreferencesManager instance = null;
    private String temperatureUnit = "Celsius"; 
    private String windSpeedUnit = "km/h"; 

    private UserPreferencesManager() {}

    public static synchronized UserPreferencesManager getInstance() {
        if (instance == null) {
            instance = new UserPreferencesManager();
        }
        return instance;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String unit) {
        if (unit.equalsIgnoreCase("Celsius") || unit.equalsIgnoreCase("Fahrenheit")) {
            this.temperatureUnit = unit;
        }
    }

    public String getWindSpeedUnit() {
        return windSpeedUnit;
    }

    public void setWindSpeedUnit(String unit) {
        if (unit.equalsIgnoreCase("km/h") || unit.equalsIgnoreCase("mph")) {
            this.windSpeedUnit = unit;
        }
    }
}
