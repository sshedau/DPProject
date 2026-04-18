package FacadeDP;
import AdapterDP.*;

public class PaymentService {
    private PaymentGateway paymentGateway;

    // Constructor Injection (can switch gateways easily)
    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(String accountId, String orderId, double amount) {
        System.out.println("Step 1: Processing Payment...");

        if (amount <= 0) {
            System.out.println("❌ Invalid payment amount!");
            return false;
        }

        paymentGateway.pay(orderId, amount);
        System.out.println("✔ Payment successful for account " + accountId);
        return true;
    }
}
