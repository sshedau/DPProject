package AdapterDP;

import FacadeDP.*;

// Target Interface
public interface PaymentGateway {
    void pay(String orderId, double amount);
}
