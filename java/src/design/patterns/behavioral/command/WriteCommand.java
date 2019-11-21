package design.patterns.behavioral.command;

import java.util.Random;

public class WriteCommand extends Command {

    private String newValue;

    public WriteCommand(Editor editor, String newValue) {
        super(editor);
        this.newValue = newValue;
    }

    @Override
    boolean execute() {
        backup();
        editor.setText(newValue);
        return true;
    }
}
