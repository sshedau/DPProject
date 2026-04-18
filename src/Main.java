import AdapterDP.*;
import FacadeDP.*;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // 🔥 Choose Payment Gateway (Adapter Pattern)
        PaymentGateway gateway = new RazorpayAdapter();
        // AdapterDP.PaymentGateway gateway = new AdapterDP.PayUGateway(); // switch easily

        // Facade Usage
        MovieBookingFacade facade = new MovieBookingFacade(gateway);

        List<String> seats = Arrays.asList("A1", "A2", "A3");

        facade.bookMovieTicket(
                "user123",
                "movie456",
                seats,
                "user@example.com",
                750
        );

        // Without Facade
//        WithoutFacadeDemo.run();
    }
}