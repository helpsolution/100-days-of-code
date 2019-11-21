package design.patterns.creational.abstract_factory;

public class MasOsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("MacOsCheckbox rendering");
    }
}
