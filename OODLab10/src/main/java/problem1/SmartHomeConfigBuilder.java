package problem1;

public class SmartHomeConfigBuilder {

  private String ownerName;
  private int numberOfLights;
  private boolean securityEnabled;

  public SmartHomeConfigBuilder() {
    this.ownerName = "";
    this.numberOfLights = 0;
    this.securityEnabled = false;
  }

  public SmartHomeConfigBuilder(String ownerName) {
    this.ownerName = ownerName;
    this.numberOfLights = 0;
    this.securityEnabled = false;
  }

  public SmartHomeConfigBuilder(int numberOfLights, String ownerName) {
    this.numberOfLights = numberOfLights;
    this.ownerName = ownerName;
    this.securityEnabled = false;
  }

  public SmartHomeConfigBuilder(String ownerName, int numberOfLights, boolean securityEnabled) {
    this.ownerName = ownerName;
    this.numberOfLights = numberOfLights;
    this.securityEnabled = securityEnabled;
  }

  public SmartHomeConfigBuilder ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  public SmartHomeConfigBuilder numberOfLights(int numberOfLights) {
    this.numberOfLights = numberOfLights;
    return this;
  }

  public SmartHomeConfigBuilder securityEnabled(boolean securityEnabled) {
    this.securityEnabled = securityEnabled;
    return this;
  }

  public SmartHomeConfig build() {
    return new SmartHomeConfig(ownerName, numberOfLights, securityEnabled);
  }

}
