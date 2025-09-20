package problem1;

public class Main {

  private static CoffeeShopManager manager = CoffeeShopManager.getInstance();
  private static CoffeeFactory coffeeFactory = new CoffeeFactory();


  public static void main(String[] args) {

    System.out.println("Singleton Pattern\n" + "=====================================");
    manager.addSale(12.50);
    System.out.println("Total sales: $" + manager.getTotalSales());

    System.out.println("Factory Pattern\n" + "=====================================");
    Coffee latte = coffeeFactory.createCoffee("LATTE");
    System.out.println(latte);
    Coffee anotherLatte = latte.prepareCoffee();
    System.out.println("Another latte: " + anotherLatte);

    System.out.println("Strategy Pattern\n" + "=====================================");
    latte = coffeeFactory.createCoffee("LATTE");
    latte.setPricingStrategy(new HappyHourPricing());
    double startingPrice = latte.getPrice();
    double finalPrice = latte.getFinalPrice();
    System.out.println("Regular price of your chosen coffee: " + startingPrice);
    System.out.println("Happy hour price of your chosen coffee: " + finalPrice);

    System.out.println("Observer Pattern\n" + "=====================================");
    OrderManager orderManager = new OrderManager();
    orderManager.addObserver(new KitchenDisplay());
    orderManager.addObserver(new CustomerNotification());
    orderManager.placeOrder("Large Latte with extra shot!");

    System.out.println(
        "Coffee Shop Management System Started\n" + "=====================================");
    manager.clearSales();
    latte = coffeeFactory.createCoffee("LATTE");
    System.out.println("☕ " + " Preparing " + latte.getName().toLowerCase() + "...");
    latte.setPricingStrategy(new HappyHourPricing());
    System.out.println("\uD83D\uDCB0 Regular price: " + latte.getPrice());
    System.out.println("\uD83D\uDCB0 Happy hour price: " + latte.getFinalPrice());
    manager.addSale(latte.getFinalPrice());

    orderManager = new OrderManager();
    orderManager.addObserver(new KitchenDisplay());
    orderManager.addObserver(new CustomerNotification());
    orderManager.placeOrder("Large Latte with extra shot!");

    Coffee espresso = coffeeFactory.createCoffee("ESPRESSO");
    System.out.println("☕ " + " Preparing " + espresso.getName().toLowerCase() + "...");
    espresso.setPricingStrategy(new RegularPricingStrategy());
    System.out.println("\uD83D\uDCB0 Regular price: " + espresso.getPrice());
    System.out.println("\uD83D\uDCB0 Happy hour price: " + espresso.getFinalPrice());
    orderManager.placeOrder("Steamy Espresso!");
    manager.addSale(espresso.getFinalPrice());

    System.out.println("\uD83D\uDCCA Total sales today: " + manager.getTotalSales());


  }

}