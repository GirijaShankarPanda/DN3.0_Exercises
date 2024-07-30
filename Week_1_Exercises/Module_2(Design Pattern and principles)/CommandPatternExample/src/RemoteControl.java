//This is the invoker class that holds a reference to a `Command` object.
//It has a `setCommand(Command command)` method to set the command and a `pressButton()` method to execute the current command.

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
