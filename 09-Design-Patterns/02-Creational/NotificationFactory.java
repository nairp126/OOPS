// Package removed to match directory structure

// The Common Interface
interface Notification {
    void notifyUser();
}

// Concrete Implementations
class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS...");
    }
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email...");
    }
}

class PushNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Push Notification...");
    }
}

/**
 * Factory Pattern.
 * 
 * Problem: The main code shouldn't need to know 'how' to create an Email vs
 * SMS.
 * It just wants to send *some* notification.
 * Solution: A Factory class that handles the creation logic.
 */
public class NotificationFactory {

    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;

        switch (channel.toUpperCase()) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel: " + channel);
        }
    }

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        // The client code doesn't say "new SMSNotification()"
        Notification n1 = factory.createNotification("SMS");
        n1.notifyUser();

        Notification n2 = factory.createNotification("EMAIL");
        n2.notifyUser();
    }
}
