package problem1;

public class CustomerNotification implements OrderObserver {

  @Override
  public void update(String orderDetails) {
    System.out.println(
        "\uD83D\uDCE7 " + "Customer Notification: Your order is being prepared - " + orderDetails);
  }
}