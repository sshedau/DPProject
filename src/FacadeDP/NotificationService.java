package FacadeDP;
import AdapterDP.*;

public class NotificationService {
    public void sendBookingConfirmation(String userEmail, String bookingId) {
        System.out.println("Step 5: Sending Notification...");
        System.out.println("✔ FacadeDP.Booking confirmation sent to " + userEmail + " (FacadeDP.Booking ID: " + bookingId + ")");
    }
}
