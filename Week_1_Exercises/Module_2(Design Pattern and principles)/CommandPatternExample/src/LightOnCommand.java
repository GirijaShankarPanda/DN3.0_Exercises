//These are concrete command classes that implement the `Command` interface.
//Each class contains the specific logic for turning the light on.

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
