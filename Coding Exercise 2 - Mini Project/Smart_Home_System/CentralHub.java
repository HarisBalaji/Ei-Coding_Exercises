package Smart_Home_System;

import java.util.ArrayList;
import java.util.List;

public class CentralHub {
    private List<SmartDevice> devices = new ArrayList<>();
    private List<String> scheduledTasks = new ArrayList<>();
    private List<String> automatedTriggers = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    public void turnOnDevice(String id) {
        for (SmartDevice device : devices) {
            if (device.getId().equals(id)) {
                device.turnOn();
                return;
            }
        }
        System.out.println("Device with id " + id + " not found.");
    }

    public void turnOffDevice(String id) {
        for (SmartDevice device : devices) {
            if (device.getId().equals(id)) {
                device.turnOff();
                return;
            }
        }
        System.out.println("Device with id " + id + " not found.");
    }

    public void setSchedule(String id, String time, String command) {
        scheduledTasks.add("Device: " + id + ", Time: " + time + ", Command: " + command);
    }

    public void addTrigger(String condition, String action) {
        automatedTriggers.add("Condition: " + condition + ", Action: " + action);
    }

    public String getStatusReport() {
        StringBuilder report = new StringBuilder();
        for (SmartDevice device : devices) {
            report.append(device.getStatus()).append("\n");
        }
        return report.toString();
    }

    public String getScheduledTasks() {
        String tasks="";
        for(String task : scheduledTasks){
            tasks+=(task+"\n");
        }
        return tasks;
    }

    public String getAutomatedTriggers() {
        String triggers="";
        for(String trigger : automatedTriggers){
            triggers+=(trigger+"\n");
        }
        return triggers;
    }
}

