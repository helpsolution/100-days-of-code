package design.patterns.structural.decorator;

public class SlackNotifier extends BaseDecorator {

    public SlackNotifier(Notifier instance) {
        super(instance);
    }

    public void notify(String message) {
        super.notify(message);
        System.out.println("People were notified with using slack");
    }

}
