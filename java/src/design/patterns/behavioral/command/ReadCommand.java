package design.patterns.behavioral.command;

public class ReadCommand extends Command {

    public ReadCommand(Editor editor) {
        super(editor);
    }

    @Override
    boolean execute() {
        editor.showText();
        return false;
    }
}
