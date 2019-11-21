package design.patterns.behavioral.strategy;

public class CardPay implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("Payed with card");
    }
}
