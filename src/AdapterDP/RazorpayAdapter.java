package AdapterDP;

import FacadeDP.*;

// Adapter Class
public class RazorpayAdapter implements PaymentGateway{
    private RazorpayAPI razorpayAPI;

    public RazorpayAdapter() {
        this.razorpayAPI = new RazorpayAPI();
    }

    @Override
    public void pay(String orderId, double amount) {
        razorpayAPI.makePayment(orderId, amount);
    }
}
