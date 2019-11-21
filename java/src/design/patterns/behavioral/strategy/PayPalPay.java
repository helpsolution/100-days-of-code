package design.patterns.behavioral.strategy;

public class PayPalPay implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("Payed with pay pal");
    }
}
