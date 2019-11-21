package design.patterns.behavioral.observer;

import java.util.LinkedList;

public class MessageHub {

    private LinkedList messages = new LinkedList();
    private EventManager eventManager;

    public MessageHub(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void addMessage(String message){
        messages.add(message);
        eventManager.notify(message);
    }

    public EventManager getEventManager() {
        return eventManager;
    }
}
