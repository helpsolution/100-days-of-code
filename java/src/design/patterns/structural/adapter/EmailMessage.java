package design.patterns.structural.adapter;

public class EmailMessage {

    private String text;

    public EmailMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
