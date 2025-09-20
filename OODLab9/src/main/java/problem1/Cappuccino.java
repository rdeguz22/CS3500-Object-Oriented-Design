package problem1;

public class Cappuccino extends AbstractCoffee {

  private static final String NAME = "CAPPUCCINO";
  private static final double PRICE = 5.5;

  Cappuccino() {
  }

  @Override
  public String getName() {
    return this.NAME;
  }

  @Override
  public double getPrice() {
    return this.PRICE;
  }
}
