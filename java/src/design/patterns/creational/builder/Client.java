package design.patterns.creational.builder;

public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.createEcoCar(carBuilder);
        Car car = carBuilder.build();
        System.out.println("Craeted car: " + car);

        ManualBuilder manualBuilder = new ManualBuilder();
        director.createEcoCar(manualBuilder);
        Manual manual = manualBuilder.build();
        System.out.println("Created manual: "+ manual);

    }
}
