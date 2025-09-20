package problem1;

import java.util.List;

class SmartHomeConfig {
  private String ownerName;
  private int numberOfLights;
  private boolean securityEnabled;

  // Constructor and getters provided
  public SmartHomeConfig(String ownerName, int numberOfLights, boolean
      securityEnabled) {
    this.ownerName = ownerName;
    this.numberOfLights = numberOfLights;
    this.securityEnabled = securityEnabled;
  }

  public int getNumberOfLights() {
    return numberOfLights;
  }

  @Override
  public String toString() {
    return "SmartHome[Owner=" + ownerName + ", Lights=" + numberOfLights
        + " , Security=" + securityEnabled + "]";
  }
}