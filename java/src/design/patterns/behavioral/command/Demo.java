package design.patterns.behavioral.command;

import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Editor editor = new Editor();
        List<Command> commands = new LinkedList<>();

        commands.add(new WriteCommand(editor, "Hello, World"));
        commands.add(new ReadCommand(editor));
        commands.add(new WriteCommand(editor, "Hello, World!"));
        commands.add(new ReadCommand(editor));
        commands.forEach(c->editor.executeCommand(c));

        editor.undo();
        editor.executeCommand(new ReadCommand(editor));
        editor.undo();
        editor.executeCommand(new ReadCommand(editor));
        editor.undo();
        editor.executeCommand(new ReadCommand(editor));
    }
}
