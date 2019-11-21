package design.patterns.creational.factory_method;

public class Car implements Transport {

    @Override
    public void move() {
        System.out.println("Move car");
    }

    @Override
    public String getInformation() {
        return "It is car";
    }
}
