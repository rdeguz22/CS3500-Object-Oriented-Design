package problem1;

public class MemberPricing implements PricingStrategy {

  private static final double DISCOUNT = 0.85;

  @Override
  public double calculatePrice(double basePrice) {
    return basePrice * DISCOUNT;
  }
}