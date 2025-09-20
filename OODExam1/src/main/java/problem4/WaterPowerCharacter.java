package problem4;

import java.time.LocalDate;
import java.util.List;

public class WaterPowerCharacter extends SinglePowerCharacter {

  public WaterPowerCharacter(String name, Double weight, Double height,
      List<String> regions, Double combatLevel, Double healthLevel,
      List<String> attacks, Double valueOfStrongestAttack,
      LocalDate dateOfLastBattle) {
    super(name, weight, height, regions, combatLevel, healthLevel, attacks, valueOfStrongestAttack,
        dateOfLastBattle);
  }
}
