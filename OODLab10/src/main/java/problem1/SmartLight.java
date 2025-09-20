package problem1;

class SmartLight {
  private boolean isOn = false;

  public void turnOn() {
    isOn = true;
    System.out.println("Light ON");
  }

  public void turnOff() {
    isOn = false;
    System.out.println("Light OFF"); }
}
