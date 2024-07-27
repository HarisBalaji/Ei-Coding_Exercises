package structuralDesign.adapterPattern;

public class PayPalAdapter implements PaymentGateway {
    private PayPal paymentGateway;

    public PayPalAdapter(PayPal paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(double amount) {
        // Convert our application's method to PayPal's method
        paymentGateway.makePayment(amount);
    }
}
