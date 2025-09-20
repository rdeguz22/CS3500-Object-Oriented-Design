package problem1;

import java.util.Objects;

/**
 * FoodItem is an abstract class, storing information about name, price per unit and available
 * quantity of a food item.
 */
public abstract class AFoodItem implements IFoodItem {

  protected String name;
  protected Double currPricePerUnit;
  protected Integer availableQuantity;
  protected Integer maxQuantity;

  /**
   * Constructor for an instance of FoodItem.
   *
   * @param name              name, as String
   * @param currPricePerUnit  price per unit, as Double
   * @param availableQuantity avilable quantity, as an Integer
   */
  public AFoodItem(String name, Double currPricePerUnit, Integer availableQuantity) {
    this.name = name;
    this.currPricePerUnit = currPricePerUnit;
    this.availableQuantity = availableQuantity;
  }

  /**
   * Getter for name
   *
   * @return name, as String
   */
  public String getName() {
    return name;
  }

  /**
   * Getter for price per unit
   *
   * @return price per unit, as Double
   */
  public Double getCurrPricePerUnit() {
    return currPricePerUnit;
  }

  /**
   * Getter for available quantity
   *
   * @return available quantity, as Integer
   */
  public Integer getAvailableQuantity() {
    return availableQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AFoodItem aFoodItem = (AFoodItem) o;
    return Objects.equals(name, aFoodItem.name) && Objects.equals(
        currPricePerUnit, aFoodItem.currPricePerUnit) && Objects.equals(availableQuantity,
        aFoodItem.availableQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, currPricePerUnit, availableQuantity);
  }
}