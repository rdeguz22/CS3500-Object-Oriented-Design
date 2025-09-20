package problem1;

public class EcoModeStrategy implements EnergyStrategy {

  @Override
  public void applyStrategy() {
    System.out.println("Eco mode: reducing power by 30%!");
  }
}
