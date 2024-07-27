package creationalDesign.factoryPattern;

public class SMSNotification implements Notification {
    
    public void notifyUser(String msg) {
        System.out.println("Sending " + msg + " from SMSNotification\n");
    }
}
