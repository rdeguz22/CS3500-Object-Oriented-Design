package problem1;

public class LightOnCommand implements Command {

  private SmartLight light;

  public LightOnCommand(SmartLight light) {
    this.light = light;
  }

  public LightOnCommand() {
    this.light = new SmartLight();
  }

  @Override
  public void execute() {
    this.light.turnOn();
  }
}
