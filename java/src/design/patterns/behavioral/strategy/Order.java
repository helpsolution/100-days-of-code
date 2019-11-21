package design.patterns.behavioral.strategy;

public class Order {
    private DeliveryStrategy deliveryStrategy;
    private PayStrategy payStrategy;

    public Order(DeliveryStrategy deliveryStrategy, PayStrategy payStrategy) {
        this.deliveryStrategy = deliveryStrategy;
        this.payStrategy = payStrategy;
    }

    public void deliver(){
        deliveryStrategy.deliver();
    }

    public void pay(){
        payStrategy.pay();
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
}
