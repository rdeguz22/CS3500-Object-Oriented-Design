package problem1;

public class Rice extends ANonPerishableFoodItem {

  public Rice(String name, Double currPricePerUnit, Integer availableQuantity) {
    super(name, currPricePerUnit, availableQuantity);
  }

  @Override
  public String toString() {
    return "Rice{" +
        "name='" + name + '\'' +
        ", currPricePerUnit=" + currPricePerUnit +
        ", availableQuantity=" + availableQuantity +
        '}';
  }
}