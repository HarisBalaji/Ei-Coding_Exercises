package Smart_Home_System;

public class DeviceProxy implements SmartDevice {
    private SmartDevice realDevice;

    public DeviceProxy(SmartDevice realDevice) {
        this.realDevice = realDevice;
    }

    public String getId() {
        return realDevice.getId();
    }

    public String getType() {
        return realDevice.getType();
    }

    public void turnOn() {
        System.out.println("Proxy: Turning on " + realDevice.getType() + " " + realDevice.getId());
        realDevice.turnOn();
    }

    public void turnOff() {
        System.out.println("Proxy: Turning off " + realDevice.getType() + " " + realDevice.getId());
        realDevice.turnOff();
    }

    public String getStatus() {
        return realDevice.getStatus();
    }
}

