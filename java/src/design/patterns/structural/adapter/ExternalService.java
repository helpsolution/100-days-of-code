package design.patterns.structural.adapter;

import java.util.Random;

public class ExternalService {

    public boolean sendMessage(Message message){

        System.out.println("Delivered message: " + message.getValue());

        return new Random().nextBoolean();
    }
}
