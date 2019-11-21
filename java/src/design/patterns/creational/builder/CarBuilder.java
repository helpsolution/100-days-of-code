package design.patterns.creational.builder;

public class CarBuilder implements Builder {

    private String seats;
    private String engine;
    private String computer;

    @Override
    public void setSeats(String seats) {
        this.seats = seats;
    }

    @Override
    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car build(){
        return new Car(seats, engine, computer);
    }
}
