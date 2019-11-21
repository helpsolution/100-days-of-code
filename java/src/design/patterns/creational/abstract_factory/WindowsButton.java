package design.patterns.creational.abstract_factory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("WindowsButton rendering");
    }

    @Override
    public void click() {
        System.out.println("WindowsButton was clicked");
    }
}
