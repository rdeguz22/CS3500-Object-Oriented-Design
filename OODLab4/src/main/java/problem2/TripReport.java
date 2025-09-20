package problem2;

import java.util.Objects;

public class TripReport {

  private AVehicle vehicle;
  private float speed;
  private float distance;
  private float duration;

  public TripReport(AVehicle vehicle, float speed, float distance, float duration) {
    this.vehicle = vehicle;
    this.speed = speed;
    this.distance = distance;
    this.duration = duration;
  }

  public AVehicle getVehicle() {
    return vehicle;
  }

  public float getSpeed() {
    return speed;
  }

  public float getDistance() {
    return distance;
  }

  public float getDuration() {
    return duration;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripReport that = (TripReport) o;
    return Float.compare(speed, that.speed) == 0
        && Float.compare(distance, that.distance) == 0
        && Float.compare(duration, that.duration) == 0 && Objects.equals(vehicle,
        that.vehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicle, speed, distance, duration);
  }
}
