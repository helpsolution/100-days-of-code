package design.patterns.behavioral.chain_of_responseability;

public class SecurityHandler extends BaseHandler {

    @Override
    public void handle(Request request) {

        System.out.println("Some security logic "+ request);

        super.handle(request);
    }
}
