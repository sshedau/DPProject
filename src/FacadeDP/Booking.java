package FacadeDP;

import java.util.List;
import java.util.UUID;
import AdapterDP.*;

public class Booking {
    String bookingId;
    String accountId;
    String movieId;
    List<String> seats;

    public Booking(String accountId, String movieId, List<String> seats) {
        this.bookingId = UUID.randomUUID().toString();
        this.accountId = accountId;
        this.movieId = movieId;
        this.seats = seats;
    }
}
