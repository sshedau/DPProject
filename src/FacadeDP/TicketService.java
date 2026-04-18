package FacadeDP;
import AdapterDP.*;

import java.util.List;

public class TicketService {
    public void generateTicket(String movieId, List<String> seats, String bookingId) {
        System.out.println("Step 3: Generating Ticket...");
        System.out.println("✔ Ticket generated for movie " + movieId);
        System.out.println("   Seats: " + seats);
        System.out.println("   FacadeDP.Booking ID: " + bookingId);
    }
}
