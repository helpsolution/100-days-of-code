package design.patterns.creational.builder;

public class Car {
    private String seats;
    private String engine;
    private String computer;

    public Car(String seats, String engine, String computer) {
        this.seats = seats;
        this.engine = engine;
        this.computer = computer;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats='" + seats + '\'' +
                ", engine='" + engine + '\'' +
                ", computer='" + computer + '\'' +
                '}';
    }
}
