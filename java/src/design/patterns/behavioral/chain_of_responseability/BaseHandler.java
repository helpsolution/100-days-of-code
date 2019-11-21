package design.patterns.behavioral.chain_of_responseability;

public abstract class BaseHandler implements Handler {

    private Handler next;

    @Override
    public void setNextHandler(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
