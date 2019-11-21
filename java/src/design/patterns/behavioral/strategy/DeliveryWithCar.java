package design.patterns.behavioral.strategy;

public class DeliveryWithCar implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Delivered wtih car");
    }
}
