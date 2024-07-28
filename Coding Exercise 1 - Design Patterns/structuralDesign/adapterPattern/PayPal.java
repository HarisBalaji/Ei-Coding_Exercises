package structuralDesign.adapterPattern;

public class PayPal {
    public void makePayment(double amount) {
        System.out.println("Paid Rs." + amount + " via PayPal.");
    }
}
