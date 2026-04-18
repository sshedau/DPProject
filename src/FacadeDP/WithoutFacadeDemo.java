package FacadeDP;

import java.util.Arrays;
import java.util.List;
import AdapterDP.*;

public class WithoutFacadeDemo {
    public static void run() {
        System.out.println("\n========== WITHOUT FACADE ==========");

        PaymentGateway gateway = new RazorpayAdapter();
        PaymentService ps = new PaymentService(gateway);

        SeatReservationService ss = new SeatReservationService();
        TicketService ts = new TicketService();

        List<String> seats = Arrays.asList("A1", "A2");

        ps.makePayment("user123", "manual123", 500);
        ss.reserveSeats("movie456", seats);
        ts.generateTicket("movie456", seats, "manual123");

        System.out.println("❗ Client handled everything manually (Complex!)");
    }
}
