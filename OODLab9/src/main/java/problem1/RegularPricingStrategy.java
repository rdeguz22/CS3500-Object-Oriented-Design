package problem1;

public class RegularPricingStrategy implements PricingStrategy {

  @Override
  public double calculatePrice(double basePrice) {
    return basePrice;
  }
}