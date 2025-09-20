package problem2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Vehicle> myVehicles = new ArrayList<>();
    Vehicle v1 = new Vehicle("VW", "Golf", 2014, Color.BLUE);
    Vehicle v2 = new Vehicle("Lexus", " ", 2021, Color.RED);
    Vehicle v3 = new Vehicle("Tesla", "Y", 2018, Color.PINK);
    myVehicles.add(v1);
    myVehicles.add(v2);
    myVehicles.add(v3);

    OlderVehiclesFilter filter = new OlderVehiclesFilter(myVehicles);
    filter.filterOlderVehicles();

    System.out.println(filter.mapByColor());
  }

}