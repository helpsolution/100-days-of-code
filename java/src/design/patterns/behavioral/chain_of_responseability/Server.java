package design.patterns.behavioral.chain_of_responseability;

public class Server {
    private Handler handler;

    public Server(Handler handler) {
        this.handler = handler;
    }

    public void call(Request request){
        handler.handle(request);
    }
}
