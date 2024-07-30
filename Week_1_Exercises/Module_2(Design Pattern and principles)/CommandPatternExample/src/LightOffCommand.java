//These are concrete command classes that implement the `Command` interface.
//Each class contains the specific logic for turning the light off.

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
