package design.patterns.behavioral.observer;

public class Demo {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        EmailListener emailListener = new EmailListener();
        SlackListener slackListener = new SlackListener();

        MessageHub messageHub = new MessageHub(eventManager);
        messageHub.getEventManager().subscribe(emailListener);
        messageHub.getEventManager().subscribe(slackListener);

        messageHub.addMessage("Hello world");
        messageHub.addMessage("This is observer pattern");
        
    }
}
