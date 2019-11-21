package design.patterns.behavioral.command;

public abstract class Command {

    public Editor editor;
    private String backup;

    Command(Editor editor){
        this.editor = editor;
    }

    protected void backup(){
        this.backup = editor.getText();
    }

    public void undo(){
        this.editor.setText(backup);
    }

    abstract boolean execute();
}
