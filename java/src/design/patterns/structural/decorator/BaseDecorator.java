package design.patterns.structural.decorator;

public class BaseDecorator implements Notifier{

    private Notifier notifier;

    public BaseDecorator() {
    }

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notify(String message) {
        notifier.notify(message);
    }
}
