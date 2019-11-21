package design.patterns.structural.adapter;

public class UserClient {

    public static void main(String[] args) {

        EmailMessage emailMessage = new EmailMessage("Some text");

        ExternalService service = new ExternalService();

        MessageAdapter adapter = new MessageAdapter(emailMessage);

        service.sendMessage(adapter);
    }

}
