package structuralDesign.adapterPattern;

public class Stripe {
    public void charge(double amount) {
        System.out.println("Charged Rs." + amount + " using Stripe.");
    }
}
