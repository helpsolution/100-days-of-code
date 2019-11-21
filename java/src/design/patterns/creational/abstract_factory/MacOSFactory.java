package design.patterns.creational.abstract_factory;

public class MacOSFactory implements Factory {
    @Override
    public Button createButton() {
        return  new MasOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MasOsCheckbox();
    }
}
