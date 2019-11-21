package design.patterns.behavioral.chain_of_responseability;

public interface Handler {

    void setNextHandler(Handler handler);

    void handle(Request request);

}
