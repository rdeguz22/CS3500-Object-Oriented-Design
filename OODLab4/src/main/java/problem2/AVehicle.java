package problem2;

public abstract class AVehicle {

  protected String id;
  protected float avgSpeed;
  protected float maxSpeed;

  public AVehicle(String id, float avgSpeed, float maxSpeed) {
    this.id = id;
    this.avgSpeed = avgSpeed;
    this.maxSpeed = maxSpeed;
  }

  public String getId() {
    return id;
  }

  public float getAvgSpeed() {
    return avgSpeed;
  }

  public float getMaxSpeed() {
    return maxSpeed;
  }
}
