package problem1;

public class FleetManager {

  public TripReport drive(float distance, AVehicle vehicle) {
    return new TripReport(vehicle, vehicle.getAvgSpeed(), distance,
        this.calculateDuration(distance, vehicle.getAvgSpeed()));
  }

  public TripReport drive(float distance, Bus vehicle) {
    return new TripReport(vehicle, vehicle.getAvgSpeed(), distance,
        this.calculateDuration(distance, vehicle.getAvgSpeed()));
  }

  public TripReport drive(float distance, Boat vehicle) {
    return new TripReport(vehicle, vehicle.getAvgSpeed(), distance,
        this.calculateDuration(distance, vehicle.getAvgSpeed()));
  }

  public TripReport drive(float distance, Train vehicle) {
    return new TripReport(vehicle, vehicle.getAvgSpeed(), distance,
        this.calculateDuration(distance, vehicle.getAvgSpeed()));
  }

  public TripReport drive(AVehicle vehicle, float distance, int duration, float speed) {
    if (this.verifyDuration(distance, duration, speed)) {
      return new TripReport(vehicle, speed, distance, duration);
    } else {
      throw new RuntimeException("Oops... Something went wrong");
    }
  }

  public TripReport drive(AVehicle vehicle, int duration) {
    return new TripReport(vehicle, vehicle.getAvgSpeed(),
        this.calculateDistance(duration, vehicle.getAvgSpeed()), duration);
  }

  public TripReport drive(AVehicle vehicle, int duration, float speed) {
    return new TripReport(vehicle, speed, this.calculateDistance(duration, speed), duration);
  }

  private Boolean verifyDuration(float distance, int duration, float speed) {
    return duration == Math.round(distance / speed);
  }

  private int calculateDuration(float distance, float speed) throws RuntimeException {
    if (speed > 0) {
      return Math.round(distance / speed);
    } else {
      throw new RuntimeException("Speed must be greater than 0");
    }
  }

  private Float calculateDistance(int duration, Float avgSpeed) {
    return duration * avgSpeed;
  }
}