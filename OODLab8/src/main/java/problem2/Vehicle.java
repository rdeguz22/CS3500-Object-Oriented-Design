package problem2;

import java.awt.Color;
import java.util.Objects;

public class Vehicle {

  private String make;
  private String model;
  private Integer year;
  private Color color;

  public Vehicle(String make, String model, Integer year, Color color) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public Integer getYear() {
    return year;
  }

  public Color getColor() {
    return color;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(make, vehicle.make) && Objects.equals(model,
        vehicle.model) && Objects.equals(year, vehicle.year) && Objects.equals(
        color, vehicle.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(make, model, year, color);
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "make='" + make + '\'' +
        ", model='" + model + '\'' +
        ", year=" + year +
        ", color=" + color +
        '}';
  }
}