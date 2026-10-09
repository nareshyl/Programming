import java.util.Scanner;

// Base Interface
interface Notification {
    void send(String message);
}

// Email Notification
class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification...");
        System.out.println("Message: " + message);
    }
}

// SMS Notification
class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS Notification...");
        System.out.println("Message: " + message);
    }
}

// Push Notification
class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification...");
        System.out.println("Message: " + message);
    }
}

// New notification type
// Demonstrates extensibility
class SlackNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Slack Notification...");
        System.out.println("Message: " + message);
    }
}

// Main class
public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== NOTIFICATION SYSTEM =====");

        System.out.print("Enter message: ");
        String message = sc.nextLine();

        System.out.println("\nSelect Notification Type:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Push");
        System.out.println("4. Slack");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Base interface reference
        Notification notification;

        switch (choice) {

            case 1:
                notification = new EmailNotification();
                break;

            case 2:
                notification = new SMSNotification();
                break;

            case 3:
                notification = new PushNotification();
                break;

            case 4:
                notification = new SlackNotification();
                break;

            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        System.out.println();

        // Runtime polymorphism
        notification.send(message);

        sc.close();
    }
}