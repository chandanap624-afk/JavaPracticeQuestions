package com.wipro.Java.DesignPatterns;

//Factory Design pattern Example//

public class FactoryMessage {

    public static void main(String[] args) {

        Notification notification;

        // Email
        notification = NotificationFactory.getNotification("EMAIL");
        notification.send("Hello via Email");

        // SMS
        notification = NotificationFactory.getNotification("SMS");
        notification.send("Hello via SMS");

        // Push
        notification = NotificationFactory.getNotification("PUSH");
        notification.send("Hello via Push Notification");
    }
}

// 1. Common Interface
interface Notification {
    void send(String message);
}

// 2. Concrete Classes
class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Push Notification sent: " + message);
    }
}

// 3. Factory Class
class NotificationFactory {

    public static Notification getNotification(String type) {

        if (type == null) return null;

        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }

        return null;
    }
}
