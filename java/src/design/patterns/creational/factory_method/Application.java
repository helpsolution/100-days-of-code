package design.patterns.creational.factory_method;

public class Application {

    public static void main(String[] args) {

        String conditions = "ocean";

        Factory factory;

        switch (conditions) {
            case "ocean":
                factory = new ShipFactory();
                break;
            case "soil":
                factory = new CarFactory();
                break;
            default:
                throw new RuntimeException("Unknown type kof conditions");
        }

        Transport transport = factory.createTransport();

        System.out.println("Information about transport: " + transport.getInformation());
        transport.move();
    }
}
