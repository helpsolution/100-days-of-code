package design.patterns.creational.builder;

public class ManualBuilder implements Builder {

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

    public Manual build(){
        return new Manual(seats, engine, computer);
    }
}
