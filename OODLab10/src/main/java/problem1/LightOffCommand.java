package problem1;

public class LightOffCommand implements Command {

  private SmartLight smartLight;

  public LightOffCommand(SmartLight smartLight) {
    this.smartLight = smartLight;
  }

  public LightOffCommand() {
    this.smartLight = new SmartLight();
  }

  @Override
  public void execute() {
    this.smartLight.turnOff();

  }
}
