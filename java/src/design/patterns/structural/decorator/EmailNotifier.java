package design.patterns.structural.decorator;

public class EmailNotifier implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println("People were notified with using email");
    }
}
