package design.patterns.creational.factory_method;

public class CarFactory implements Factory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
