class Notifier {

    public void send(String message) {
        System.out.println("General Notification: " + message);
    }

    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }

    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }

    private void send(String message, String email, long phoneNumber) {
        System.out.println("Internal Log -> Msg: " + message +
                ", Email: " + email +
                ", Phone: " + phoneNumber);
    }

    public void sendFullNotification(String message, String email, long phoneNumber) {
        send(message, email, phoneNumber);
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {

        Notifier notifier = new Notifier();

        notifier.send("System Update Available");

        notifier.send("Welcome!", "user@example.com");

        notifier.send("OTP Verification", 9876543210L);

        notifier.sendFullNotification("Alert!", "admin@example.com", 9123456780L);
    }
}