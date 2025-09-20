package problem1;

public class Espresso extends AbstractCoffee {

  private static final String ESPRESSO = "ESPRESSO";
  private static final double PRICE = 4.5;

  Espresso() {
  }

  @Override
  public String getName() {
    return this.ESPRESSO;
  }

  @Override
  public double getPrice() {
    return this.PRICE;
  }
}