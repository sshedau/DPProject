package FacadeDP;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import AdapterDP.*;

public class SeatReservationService {
    private Set<String> bookedSeats = new HashSet<>();

    public boolean reserveSeats(String movieId, List<String> seats) {
        System.out.println("Step 2: Reserving Seats...");

        for (String seat : seats) {
            if (bookedSeats.contains(seat)) {
                System.out.println("❌ Seat " + seat + " is already booked!");
                return false;
            }
        }

        for (String seat : seats) {
            bookedSeats.add(seat);
            System.out.println("✔ Seat " + seat + " reserved for movie " + movieId);
        }

        return true;
    }
}
