package design.patterns.creational.builder;

public class Manual {
    private String seats;
    private String engine;
    private String computer;

    public Manual(String seats, String engine, String computer) {
        this.seats = seats;
        this.engine = engine;
        this.computer = computer;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seats='" + seats + '\'' +
                ", engine='" + engine + '\'' +
                ", computer='" + computer + '\'' +
                '}';
    }
}
