package Smart_Home_System;

import java.util.Scanner;

public class SmartHomeMain {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSmart Home System");
            System.out.println("1. Add Device");
            System.out.println("2. Turn On Device");
            System.out.println("3. Turn Off Device");
            System.out.println("4. Set Schedule");
            System.out.println("5. Add Trigger");
            System.out.println("6. View Status Report");
            System.out.println("7. View Scheduled Tasks");
            System.out.println("8. View Automated Triggers");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try{
                switch (choice) {
                    case 1:
                        System.out.print("Enter device type (light, thermostat, doorlock): ");
                        String type = scanner.nextLine();
                        SmartDevice device = SmartDeviceFactory.createDevice(type);
                        SmartDevice proxyDevice = new DeviceProxy(device);
                        hub.addDevice(proxyDevice);
                        System.out.println(type + " added with ID " + device.getId());
                        break;
                    case 2:
                        System.out.print("Enter device ID to turn on: ");
                        String turnOnId = scanner.nextLine();
                        hub.turnOnDevice(turnOnId);
                        break;
                    case 3:
                        System.out.print("Enter device ID to turn off: ");
                        String turnOffId = scanner.nextLine();
                        hub.turnOffDevice(turnOffId);
                        break;
                    case 4:
                        System.out.print("Enter device ID to schedule: ");
                        String scheduleId = scanner.nextLine();
                        System.out.print("Enter time to schedule (HH:mm): ");
                        String time = scanner.nextLine();
                        System.out.print("Enter command (Turn On/Turn Off or Open/Close): ");
                        String command = scanner.nextLine();
                        hub.setSchedule(scheduleId, time, command);
                        System.out.println("Scheduled " + command + " for device " + scheduleId + " at " + time);
                        break;
                    case 5:
                        System.out.print("Enter condition (e.g., temperature > 70): ");
                        String condition = scanner.nextLine();
                        System.out.print("Enter action (Turn On/Turn Off): ");
                        String action = scanner.nextLine();
                        hub.addTrigger(condition, action);
                        System.out.println("Added trigger: " + condition + " -> " + action);
                        break;
                    case 6:
                        System.out.println("Status Report:");
                        System.out.println(hub.getStatusReport());
                        break;
                    case 7:
                        System.out.println("Scheduled Tasks:");
                        System.out.println(hub.getScheduledTasks());
                        break;
                    case 8:
                        System.out.println("Automated Triggers:");
                        System.out.println(hub.getAutomatedTriggers());
                        break;
                    case 9:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}