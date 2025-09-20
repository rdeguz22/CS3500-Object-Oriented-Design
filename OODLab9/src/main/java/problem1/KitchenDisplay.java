package problem1;

import java.util.Observable;

public class KitchenDisplay implements OrderObserver {

  @Override
  public void update(String orderDetails) {
    System.out.println("\uD83D\uDCF1 " + "Kitchen Display: New order - " + orderDetails);
  }
}