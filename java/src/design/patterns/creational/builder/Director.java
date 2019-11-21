package design.patterns.creational.builder;

public class Director {

    public void createSportCar(Builder builder){
        builder.setComputer("Nvx 150");
        builder.setEngine("Sport+");
        builder.setSeats("4");
    }

    public void createEcoCar(Builder builder){
        builder.setComputer("RTC 01");
        builder.setEngine("Eco global 220");
        builder.setSeats("5");
    }

}
