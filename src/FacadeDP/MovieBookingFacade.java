package FacadeDP;

import java.util.List;
import AdapterDP.*;

public class MovieBookingFacade {
    private PaymentService paymentService;
    private SeatReservationService seatReservationService;
    private NotificationService notificationService;
    private LoyaltyPointsService loyaltyPointsService;
    private TicketService ticketService;

    // Constructor (choose payment gateway here)
    public MovieBookingFacade(PaymentGateway gateway) {
        this.paymentService = new PaymentService(gateway);
        this.seatReservationService = new SeatReservationService();
        this.notificationService = new NotificationService();
        this.loyaltyPointsService = new LoyaltyPointsService();
        this.ticketService = new TicketService();
    }

    public void bookMovieTicket(String accountId, String movieId, List<String> seats, String userEmail, double amount) {
        System.out.println("\n========== MOVIE BOOKING STARTED ==========");

        Booking booking = new Booking(accountId, movieId, seats);

        // Step 1: Payment (Adapter used internally)
        if (!paymentService.makePayment(accountId, booking.bookingId, amount)) {
            System.out.println("❌ FacadeDP.Booking Failed: Payment Error");
            return;
        }

        // Step 2: Seat Reservation
        if (!seatReservationService.reserveSeats(movieId, seats)) {
            System.out.println("❌ FacadeDP.Booking Failed: Seat Issue");
            return;
        }

        // Step 3: Ticket Generation
        ticketService.generateTicket(movieId, seats, booking.bookingId);

        // Step 4: Loyalty Points
        loyaltyPointsService.addPoints(accountId, 50);

        // Step 5: Notification
        notificationService.sendBookingConfirmation(userEmail, booking.bookingId);

        System.out.println("🎉 Movie ticket booking completed successfully!");
        System.out.println("===========================================");
    }
}
