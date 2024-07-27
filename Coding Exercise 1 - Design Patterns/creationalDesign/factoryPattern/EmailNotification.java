package creationalDesign.factoryPattern;

public class EmailNotification implements Notification {

    public void notifyUser(String msg) {
        System.out.println("Sending " + msg + " from EmailNotification");
    }
}
