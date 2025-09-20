package problem1;

public class CoffeeFactory {

  public Coffee createCoffee(String coffeeType) {
    switch (coffeeType) {
      case "ESPRESSO": {
        return new Espresso();
      }
      case "LATTE": {
        return new Latte();
      }
      case "CAPPUCCINO": {
        return new Cappuccino();
      }
      default:
        return null;
    }
  }
}