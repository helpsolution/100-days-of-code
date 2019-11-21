package design.patterns.behavioral.strategy;

public class DeliveryWithPost implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Delivered with post");
    }
}
