package problem2;

public class FleetManager {

  public TripReport drive(float distance, AVehicle vehicle) {
    return new TripReport(vehicle, vehicle.avgSpeed, distance, (distance / vehicle.avgSpeed));
  }

  public TripReport drive(float distance, AVehicle vehicle, float speed) {
    if (speed > vehicle.maxSpeed) {
      speed = vehicle.maxSpeed;
    }
    return new TripReport(vehicle, speed, distance, (distance / speed));
  }

  public TripReport drive(AVehicle vehicle, float speed, float distance, float duration) {
    if (speed > vehicle.maxSpeed) {
      speed = vehicle.maxSpeed;
    }
    return new TripReport(vehicle, speed, distance, duration);
  }

  public TripReport drive(AVehicle vehicle, float duration) {
    return new TripReport(vehicle, vehicle.avgSpeed, (vehicle.avgSpeed * duration), duration);
  }
}
