package design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EventManager {
    private HashSet<EventListener> listeners = new HashSet<>();

    public void subscribe( EventListener eventListener){
        listeners.add(eventListener);
    }

    public void unsubscribe(EventListener eventListener){
        listeners.remove(eventListener);
    }

    public void notify(String data){
        listeners.forEach(l -> l.update(data));
    }

}
