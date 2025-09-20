package problem1;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

  private List<OrderObserver> orderObservers;

  public OrderManager(List<OrderObserver> orderObservers) {
    this.orderObservers = orderObservers;
  }

  public OrderManager() {
    this.orderObservers = new ArrayList<>();
  }

  public void addObserver(OrderObserver orderObserver) {
    orderObservers.add(orderObserver);
  }

  public void placeOrder(String order) {
    for (OrderObserver orderObserver : orderObservers) {
      orderObserver.update(order);

    }
  }
}