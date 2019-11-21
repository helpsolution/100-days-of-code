package design.patterns.creational.abstract_factory;

public class MasOsButton implements Button {
    @Override
    public void render() {
        System.out.println("MasOsButton rendering");
    }

    @Override
    public void click() {
        System.out.println("MasOsButton was clicked");
    }
}
