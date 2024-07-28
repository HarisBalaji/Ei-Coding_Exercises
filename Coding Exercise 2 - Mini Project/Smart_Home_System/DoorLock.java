package Smart_Home_System;

public class DoorLock implements SmartDevice {
    private String id;
    private String status;

    public DoorLock(String id) {
        this.id = id;
        this.status = "locked";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getType() {
        return "door lock";
    }

    @Override
    public void turnOn() {
        status = "unlocked";
        System.out.println("Door " + id + " is unlocked.");
    }

    @Override
    public void turnOff() {
        status = "locked";
        System.out.println("Door " + id + " is locked.");
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + status;
    }
}