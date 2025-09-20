package problem2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OlderVehiclesFilter {

  private static final Integer CUTOFF_YEAR = 2019;
  private List<Vehicle> vehicles = new ArrayList<>();

  public OlderVehiclesFilter(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public OlderVehiclesFilter(Vehicle vehicle1, Vehicle
      vehicle2, Vehicle vehicle3) {
    this.vehicles.add(vehicle1);
    this.vehicles.add(vehicle2);
    this.vehicles.add(vehicle3);
  }

  /**
   * Method prints out make, model and year of all the vehicles manufactured after 1999.
   */
  public void filterOlderVehicles() {
    this.vehicles.stream().filter(isYoungerThan1999)
        .forEach(x -> System.out.println(x.getMake() + " " + x.getModel() + " " + x.getYear()));
    this.vehicles.stream().filter(x -> x.getYear() > CUTOFF_YEAR)
        .map(y -> y.getMake() + " " + y.getModel() + " " + y.getYear())
        .forEach(System.out::println);
  }

  Predicate<Vehicle> isYoungerThan1999 = v -> v.getYear() > CUTOFF_YEAR;

  public Map<Color, Long> mapByColor() {
    return this.vehicles.stream().map(x -> x.getColor())
        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
  }

  //Method returns the oldest vehicle (without a comparator)
  public Optional<Integer> findOldestVehicle() {
    return this.vehicles.stream().map(x -> x.getYear()).max(Comparator.naturalOrder());
    //return this.vehicles.stream().sorted(oldestVehicle).min(oldestVehicle);
  }

  Comparator<Vehicle> oldestVehicle = new Comparator<Vehicle>() {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {

      return v1.getYear() - v2.getYear();
    }
  };
}