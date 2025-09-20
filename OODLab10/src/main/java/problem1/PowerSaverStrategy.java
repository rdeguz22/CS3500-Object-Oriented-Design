package problem1;

public class PowerSaverStrategy implements EnergyStrategy {

  @Override
  public void applyStrategy() {
    System.out.println("Power Saver: reducing power by 50%!");
  }
}
