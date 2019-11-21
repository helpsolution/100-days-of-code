package design.patterns.behavioral.chain_of_responseability;

public class MetricsHandler extends BaseHandler {
    @Override
    public void handle(Request request) {

        System.out.println("Some logic with monitoring "+ request);

        super.handle(request);
    }
}
