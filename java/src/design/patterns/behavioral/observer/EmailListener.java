package design.patterns.behavioral.observer;

public class EmailListener implements EventListener{
    @Override
    public void update(String data) {
        System.out.println("Sent message '"+ data + "' with using email");
    }
}
