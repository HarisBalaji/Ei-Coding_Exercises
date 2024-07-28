# Ei-Coding Exercise (Output)

## 1. Design patterns

## i) Behavioral Design Patterns
Use Case 1: Observer Pattern
* Scenario: Stock Price Monitoring System
* Description: Implement a stock price monitoring system where multiple clients (observers) subscribe to updates on stock prices. Whenever the stock price changes, the system notifies all subscribed clients.

![Screenshot 27-07-2024 14_50_49](https://github.com/user-attachments/assets/76ebf933-9cee-46ea-a116-dfbfe27098f8)


Use Case 2: Strategy Pattern
* Scenario: Payment Processing System
* Description: Implement a payment processing system that supports multiple payment methods (e.g., credit card, GPay, bank transfer). The system should be able to switch between different payment strategies at runtime based on user selection.

![observerPattern 27-07-2024 15_07_21](https://github.com/user-attachments/assets/2fc6fa12-63ab-4e45-a1f3-41cc46d20e94)


## ii) Creational Design Patterns
Use Case 3: Singleton Pattern
* Scenario: Configuration Manager
* Description: Implement a configuration manager that ensures only one instance of the configuration settings exists throughout the application. This manager should be thread-safe and provide global access to the configuration settings.

![Strategy Design Pattern in Java - Example Tutorial _ DigitalOcean - Brave 27-07-2024 15_15_26](https://github.com/user-attachments/assets/21597970-2dfd-4046-9c7e-788a6c1559cb)


Use Case 4: Factory Pattern
* Scenario: Notification System
* Description: Implement a notification system that can send different types of notifications (e.g., Email, SMS Notification) based on the input parameters. The system should use a factory to instantiate the appropriate notification objects.

![Coding Exercises Overview - Brave 27-07-2024 15_23_44](https://github.com/user-attachments/assets/b437a7c7-4564-40ae-a491-2e78b86aa854)


## iii) Structural Design Patterns
Use Case 5: Adapter Pattern
* Scenario: Legacy System Integration
* Description: Implement an adapter to integrate a new payment gateway with an existing e-commerce system. The existing system expects a specific interface, but the new payment gateway has a different interface. The adapter will translate between the two interfaces.

![SMSNotification java - Coding Exercise 1 - Design Patterns - Visual Studio Code 27-07-2024 15_30_06](https://github.com/user-attachments/assets/fd6f959d-d6ef-43fe-9a90-3b90e123bc36)


Use Case 6: Composite Pattern
* Scenario: File System Hierarchy
* Description: Implement a file system hierarchy where files and directories are represented as a tree structure. Each directory can contain files and other directories. The system should allow operations like adding, removing, and displaying details of files and directories.

![PaymentGateway java - Coding Exercise 1 - Design Patterns - Visual Studio Code 27-07-2024 15_34_41](https://github.com/user-attachments/assets/0ca5fcab-8ac8-4eb7-9f6b-00b1bed27ef1)


## 2. Mini-Project

## Project 4: Smart Home System

### Problem Statement
Create a simulation for a Smart Home System that allows the user to control different smart devices such as lights, thermostats, and door locks via a central hub. The user should be able to set schedules, automate tasks, and view the status of each device.

This solution will incorporate the Observer, Factory Method, and Proxy patterns, as well as strong OOP principles.

SmartDevice Interface: This will be the common interface for all devices.

Concrete Devices: Implementations of different devices (Light, Thermostat, DoorLock).

Factory: Factory class to create instances of devices.

CentralHub: This class will manage all devices, schedules, and triggers.

Proxy: Proxy pattern to control access to devices.

Observer: Observer pattern to notify devices of system changes.

### Output

#### Adding a device
![C__Windows_System32_cmd exe 27-07-2024 17_26_05](https://github.com/user-attachments/assets/b9225023-609f-455a-8c7e-b44b0f23f3d1)

![C__Windows_System32_cmd exe 27-07-2024 17_26_13](https://github.com/user-attachments/assets/0f4499e4-0174-4b03-bbc2-5efae6c2e084)

#### Viewing the status of each device
![C__Windows_System32_cmd exe 27-07-2024 17_26_22](https://github.com/user-attachments/assets/8edd8790-2ace-42c2-b605-ba124e1170f7)

#### Turning on a device
![C__Windows_System32_cmd exe 27-07-2024 17_26_50](https://github.com/user-attachments/assets/da5431d3-d790-465d-b843-a1a8c4d60b91)

#### Turning off a device
![C__Windows_System32_cmd exe 27-07-2024 17_27_15](https://github.com/user-attachments/assets/ae099a4c-f1fd-4225-b727-62f91717cf74)

#### Setting schedule fo rdifferent devices
![C__Windows_System32_cmd exe 27-07-2024 17_27_32](https://github.com/user-attachments/assets/e3153694-7e14-48bc-91ea-5da7ddaa39a4)

#### View the scheduled tasks
![C__Windows_System32_cmd exe 27-07-2024 17_27_39](https://github.com/user-attachments/assets/7d5317c6-c3fc-4321-b691-e163600aae27)

#### Adding a trigger
![C__Windows_System32_cmd exe 27-07-2024 17_27_47](https://github.com/user-attachments/assets/df8ebd90-c4f5-402e-9220-69e52ca091c8)

#### View the automated triggers
![C__Windows_System32_cmd exe 27-07-2024 17_27_54](https://github.com/user-attachments/assets/7592f00e-7c5b-4581-97d2-86ceb9274e33)
