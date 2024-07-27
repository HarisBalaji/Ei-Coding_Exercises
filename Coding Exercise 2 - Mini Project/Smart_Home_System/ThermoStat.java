package Smart_Home_System;

public class ThermoStat implements SmartDevice {
    private String id;
    private int temperature;

    public ThermoStat(String id, int initialTemperature) {
        this.id = id;
        this.temperature = initialTemperature;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getType() {
        return "thermostat";
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat " + id + " is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat " + id + " is turned off.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat " + id + " temperature set to " + temperature + " degrees.");
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees";
    }
}
