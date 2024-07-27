package Smart_Home_System;

public class DeviceIdGenerator {
    private static int idCounter = 0;

    // Synchronized method to ensure thread safety
    public static synchronized String generateId() {
        idCounter++;
        return String.valueOf(idCounter);
    }
}

