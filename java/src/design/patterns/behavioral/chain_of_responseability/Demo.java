package design.patterns.behavioral.chain_of_responseability;

import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Request> requests = new LinkedList<>();

        requests.add(new Request("ivan67", "****", "url1"));
        requests.add(new Request("olga_cat", "****", "url2"));
        requests.add(new Request("alex88", "****", "url3"));

        Handler h1 = new SecurityHandler();
        Handler h2 = new LogHandler();
        Handler h3 = new MetricsHandler();

        h1.setNextHandler(h2);
        h2.setNextHandler(h3);

        Server server = new Server(h1);

        requests.forEach(req -> server.call(req));

    }
}
