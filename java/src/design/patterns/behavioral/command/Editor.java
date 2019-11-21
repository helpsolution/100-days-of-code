package design.patterns.behavioral.command;

public class Editor {
    private String text = "";
    private CommandHistory commandHistory = new CommandHistory();

    public void showText(){
        System.out.println("Editor text: "+ text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void executeCommand(Command c){
       if(c.execute()){
           commandHistory.push(c);
       }
    }

    public void undo(){
        if(commandHistory.isEmpty()){
            return;
        }

        Command command = commandHistory.pop();
        if(command!=null){
            command.undo();
        }
    }
}
