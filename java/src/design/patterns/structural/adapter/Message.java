package design.patterns.structural.adapter;

public class Message {
    private String text;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

    public String getValue() {
        return text;
    }

}
