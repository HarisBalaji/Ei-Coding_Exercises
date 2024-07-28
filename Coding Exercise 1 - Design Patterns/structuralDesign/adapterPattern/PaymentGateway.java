package structuralDesign.adapterPattern;

public interface PaymentGateway {
    void processPayment(double amount);
}
