package problem1;

import java.time.LocalDate;

public class Vegetable extends APerishableFoodItem {

  public Vegetable(String name, Double currPricePerUnit, Integer availableQuantity,
      LocalDate orderDate, LocalDate expiryDate) {
    super(name, currPricePerUnit, availableQuantity, orderDate, expiryDate);
  }

  @Override
  public String toString() {
    return "Vegetable{" +
        "orderDate=" + orderDate +
        ", expiryDate=" + expiryDate +
        ", name='" + name + '\'' +
        ", currPricePerUnit=" + currPricePerUnit +
        ", availableQuantity=" + availableQuantity +
        '}';
  }
}