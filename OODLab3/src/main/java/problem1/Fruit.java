package problem1;

import java.time.LocalDate;

public class Fruit extends APerishableFoodItem {

  public Fruit(String name, Double currPricePerUnit, Integer availableQuantity,
      LocalDate orderDate, LocalDate expiryDate) {
    super(name, currPricePerUnit, availableQuantity, orderDate, expiryDate);
  }

  @Override
  public String toString() {
    return "Fruit{" +
        "orderDate=" + orderDate +
        ", expiryDate=" + expiryDate +
        ", name='" + name + '\'' +
        ", currPricePerUnit=" + currPricePerUnit +
        ", availableQuantity=" + availableQuantity +
        '}';
  }
}