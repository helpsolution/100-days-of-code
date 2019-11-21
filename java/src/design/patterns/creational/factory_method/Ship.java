package design.patterns.creational.factory_method;

public class Ship implements Transport{

    @Override
    public void move() {
        System.out.println("Move ship");
    }

    @Override
    public String getInformation() {
        return "It is ship";
    }
}
