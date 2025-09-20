package problem1;

public class Pasta extends ANonPerishableFoodItem {

  public Pasta(String name, Double currPricePerUnit, Integer availableQuantity) {
    super(name, currPricePerUnit, availableQuantity);
  }

  @Override
  public String toString() {
    return "Pasta{" +
        "name='" + name + '\'' +
        ", currPricePerUnit=" + currPricePerUnit +
        ", availableQuantity=" + availableQuantity +
        '}';
  }
}