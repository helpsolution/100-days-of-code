package design.patterns.creational.factory_method;

public class ShipFactory implements Factory {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
