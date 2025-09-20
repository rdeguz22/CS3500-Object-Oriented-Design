package problem4;

import java.time.LocalDate;
import java.util.List;

public class IcePowerCharacter extends SinglePowerCharacter {

  public IcePowerCharacter(String name, Double weight, Double height, List<String> regions,
      Double combatLevel, Double healthLevel, List<String> attacks,
      Double valueOfStrongestAttack, LocalDate dateOfLastBattle) {
    super(name, weight, height, regions, combatLevel, healthLevel, attacks, valueOfStrongestAttack,
        dateOfLastBattle);
  }
}
