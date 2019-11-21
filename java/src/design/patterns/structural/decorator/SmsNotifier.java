package design.patterns.structural.decorator;

public class SmsNotifier extends BaseDecorator{

    public SmsNotifier(Notifier instance) {
        super(instance);
    }

    public void notify(String message) {
        super.notify(message);
        System.out.println("People were notified with using sms");
    }

}
