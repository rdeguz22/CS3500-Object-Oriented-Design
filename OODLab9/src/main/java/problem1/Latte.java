package problem1;

public class Latte extends AbstractCoffee {

  private static final String LATE = "LATTE";
  private static final double PRICE = 5.25;

  Latte() {
  }

  @Override
  public String getName() {
    return this.LATE;
  }

  @Override
  public double getPrice() {
    return this.PRICE;
  }

  @Override
  public String toString() {
    return "Latte{}";
  }
}