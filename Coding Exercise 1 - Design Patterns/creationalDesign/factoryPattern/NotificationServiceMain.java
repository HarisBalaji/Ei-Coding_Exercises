package creationalDesign.factoryPattern;

public class NotificationServiceMain {
    public static void main(String[] args) {
        try {
            NotificationFactory notificationFactory = new NotificationFactory();
            Notification smsNotification = notificationFactory.createNotification("SMS");
            smsNotification.notifyUser("Hello");

            Notification emailNotification = notificationFactory.createNotification("EMAIL");
            emailNotification.notifyUser("Hi, Haris!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
