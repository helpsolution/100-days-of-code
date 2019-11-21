package design.patterns.behavioral.chain_of_responseability;

public class LogHandler extends BaseHandler{
    @Override
    public void handle(Request request) {

        System.out.println("Some logic with logs with "+ request);

        super.handle(request);
    }
}
