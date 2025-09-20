package problem1;

public class HappyHourPricing implements PricingStrategy {

  private static final double DISCOUNT = 0.8;

  @Override
  public double calculatePrice(double basePrice) {
    return basePrice * DISCOUNT;
  }
}