package problem1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShopManager {

  private static List<String> processedOrders = new ArrayList<>();
  private static List<Double> sales = new ArrayList<>();
  private static CoffeeShopManager instance;

  public static synchronized CoffeeShopManager getInstance() {
    if (instance == null) {
      instance = new CoffeeShopManager();
    }
    return instance;
  }

  public void addSale(double price) {
    this.sales.add(price);
  }

  public void clearSales() {
    this.sales.clear();
  }

  public double getTotalSales() {
    return this.sales.stream().mapToDouble(Double::doubleValue).sum();
  }
}