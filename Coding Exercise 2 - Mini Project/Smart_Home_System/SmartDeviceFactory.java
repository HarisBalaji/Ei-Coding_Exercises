package Smart_Home_System;

public class SmartDeviceFactory {
    public static SmartDevice createDevice(String type) {
        String id = DeviceIdGenerator.generateId();
        switch (type.toLowerCase()) {
            case "light":
                return new Light(id);
            case "thermostat":
                return new ThermoStat(id, 70);
            case "doorlock":
                return new DoorLock(id);
            default:
                throw new IllegalArgumentException("Unknown device type: " + type+"\nSelect device of type light, thermostat or doorlock");
        }
    }
}

