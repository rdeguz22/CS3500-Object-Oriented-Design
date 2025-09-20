package problem1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Abstract class APerishableFoodItem inherits from AFoodItem, and stores information about order
 * and expiry date for perishable food items.
 */
public abstract class APerishableFoodItem extends AFoodItem {

  private static final Integer MAX_PERISHABLE_FOOD_QUANTITY = 100;
  protected LocalDate orderDate;
  protected LocalDate expiryDate;

  /**
   * Constructor for APerishableItem
   *
   * @param name               name, as a String
   * @param currPricePerUnit   price per unit, as a Double
   * @param availableQuantity, available quantity, as an Integer
   * @param orderDate          order date, as LocalDate
   * @param expiryDate,        expiry date, as LocalDate
   */
  public APerishableFoodItem(String name, Double currPricePerUnit, Integer availableQuantity,
      LocalDate orderDate, LocalDate expiryDate) {
    super(name, currPricePerUnit, availableQuantity);
    this.maxQuantity = MAX_PERISHABLE_FOOD_QUANTITY;
    this.orderDate = orderDate;
    this.expiryDate = expiryDate;
  }

  /**
   * Getter for order date.
   *
   * @return order date, as LocalDate
   */
  public LocalDate getOrderDate() {
    return orderDate;
  }

  /**
   * Getter for expiry date.
   *
   * @return expiry date, as LocalDate.
   */
  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    APerishableFoodItem that = (APerishableFoodItem) o;
    return Objects.equals(orderDate, that.orderDate) && Objects.equals(expiryDate,
        that.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), orderDate, expiryDate);
  }
}