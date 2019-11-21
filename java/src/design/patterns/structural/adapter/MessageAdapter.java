package design.patterns.structural.adapter;

public class MessageAdapter extends Message {

    private EmailMessage emailMessage;

    public MessageAdapter(EmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }

    @Override
    public String getValue() {
        return emailMessage.getText();
    }

}
