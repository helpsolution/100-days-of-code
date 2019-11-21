package design.patterns.behavioral.observer;

public class SlackListener implements EventListener {
    @Override
    public void update(String data) {
        System.out.println("Sent message '"+data+"' with using slack");
    }
}
