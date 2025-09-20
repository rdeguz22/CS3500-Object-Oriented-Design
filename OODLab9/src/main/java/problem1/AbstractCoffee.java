package problem1;

public abstract class AbstractCoffee implements Coffee {

  protected CoffeeFactory coffeeFactory = new CoffeeFactory();
  private PricingStrategy pricingStrategy;

  public Coffee prepareCoffee() {
    return this.coffeeFactory.createCoffee(this.getName());
  }

  public void setPricingStrategy(PricingStrategy pricingStrategy) {
    this.pricingStrategy = pricingStrategy;
  }

  public double getFinalPrice() {
    return this.pricingStrategy.calculatePrice(this.getPrice());
  }
}