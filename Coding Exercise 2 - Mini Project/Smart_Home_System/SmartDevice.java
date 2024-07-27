package Smart_Home_System;

public interface SmartDevice {
    String getId();
    String getType();
    void turnOn();
    void turnOff();
    String getStatus();
}