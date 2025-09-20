package problem1;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeFacade implements HomeObserver{

  private EnergyStrategy energyStrategy;
  private SmartHomeConfig smartHomeConfig;
  private List<SmartLight> smartLights;
  private static final String STATUS = "Evening mode activated.";


  public SmartHomeFacade(SmartHomeConfig config) {
    this.energyStrategy = new PowerSaverStrategy();
    this.smartHomeConfig = config;
    this.smartLights = this.initializeSmartLights();
  }

  public SmartHomeFacade(EnergyStrategy energyStrategy, SmartHomeConfig config) {
    this.energyStrategy = energyStrategy;
    this.smartHomeConfig = config;
    this.smartLights = this.initializeSmartLights();
  }

  private List<SmartLight> initializeSmartLights(){
    List<SmartLight> smartLights = new ArrayList<>();
    for(int i = 0; i < this.smartHomeConfig.getNumberOfLights(); i++){
      SmartLight smartLight = new SmartLight();
      smartLights.add(smartLight);
    }
    return smartLights;
  }

  public void activateEveningMode(){
    //Lights on
    for (SmartLight light : this.smartLights) {
      LightOnCommand lightOnCommand = new LightOnCommand(light);
      lightOnCommand.execute();
    }
    this.energyStrategy.applyStrategy();
  }

  @Override
  public void update(String status) {
    System.out.println("Smart home status: " + status);
  }
}
