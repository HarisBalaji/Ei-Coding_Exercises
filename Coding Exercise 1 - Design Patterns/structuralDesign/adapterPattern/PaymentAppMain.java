package structuralDesign.adapterPattern;

public class PaymentAppMain {
    public static void main(String[] args) {
        PaymentGateway paypalGateway = new PayPalAdapter(new PayPal());
        PaymentGateway stripeGateway = new StripeAdapter(new Stripe());

        double amount = 100.0;

        // Process payments using different payment gateways
        paypalGateway.processPayment(amount);
        System.out.println();
        stripeGateway.processPayment(amount);
    }
}
