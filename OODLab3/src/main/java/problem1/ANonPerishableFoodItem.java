package problem1;

public abstract class ANonPerishableFoodItem extends AFoodItem {

  private static final Integer MAX_NON_PERISHABLE_FOOD_ITEMS = 100;

  public ANonPerishableFoodItem(String name, Double currPricePerUnit, Integer availableQuantity) {
    super(name, currPricePerUnit, availableQuantity);
    this.maxQuantity = MAX_NON_PERISHABLE_FOOD_ITEMS;
  }
}