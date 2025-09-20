package problem1;

public interface Coffee {

  String getName();

  double getPrice();

  Coffee prepareCoffee();

  void setPricingStrategy(PricingStrategy pricingStrategy);

  double getFinalPrice();
}