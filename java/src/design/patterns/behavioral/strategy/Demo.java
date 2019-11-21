package design.patterns.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {

        DeliveryStrategy deliveryStrategy = new DeliveryWithCar();
        PayStrategy payStrategy = new PayPalPay();

        Order order = new Order(deliveryStrategy, payStrategy);

        order.pay();
        order.deliver();
    }
}
