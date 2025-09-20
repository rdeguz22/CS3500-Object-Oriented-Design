package problem4;

import java.util.List;

public class MultiplePowerCharacter extends Character {

  private String primaryPower;
  private List<String> specialAbilities;
  
  public MultiplePowerCharacter(String name, Double weight, Double height, List<String> regions,
      Double combatLevel, Double healthLevel, String primaryPower, List<String> specialAbilities) {
    super(name, weight, height, regions, combatLevel, healthLevel);
    this.primaryPower = primaryPower;
    this.specialAbilities = specialAbilities;
  }

  public String getPrimaryPower() {
    return primaryPower;
  }

  public List<String> getSpecialAbilities() {
    return specialAbilities;
  }
}
