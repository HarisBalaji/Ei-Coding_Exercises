package Smart_Home_System;

public class Light implements SmartDevice {
    private String id;
    private String status;

    public Light(String id) {
        this.id = id;
        this.status = "off";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getType() {
        return "light";
    }

    @Override
    public void turnOn() {
        status = "on";
        System.out.println("Light " + id + " is turned on.");
    }

    @Override
    public void turnOff() {
        status = "off";
        System.out.println("Light " + id + " is turned off.");
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + status;
    }
}
