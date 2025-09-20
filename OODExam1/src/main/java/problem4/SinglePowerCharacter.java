package problem4;

import java.time.LocalDate;
import java.util.List;

public abstract class SinglePowerCharacter extends Character {

  private List<String> attacks;
  private Double ValueOfStrongestAttack;
  private LocalDate dateOfLastBattle;
  private static final Double SINGLE_POWER_CAPTURE_DECREASE = 0.7;
  private static final Integer ATTACKS_THRESHOLD = 5;
  private static final Double SINGLE_POWER_BATTLE_INCREASE = 1.3;
  private static final long DATE_OF_LAST_BATTLE_THRESHOLD = 14;

  public SinglePowerCharacter(String name, Double weight, Double height, List<String> regions,
      Double combatLevel, Double healthLevel, List<String> attacks, Double valueOfStrongestAttack,
      LocalDate dateOfLastBattle) {
    super(name, weight, height, regions, combatLevel, healthLevel);
    this.attacks = attacks;
    ValueOfStrongestAttack = valueOfStrongestAttack;
    this.dateOfLastBattle = dateOfLastBattle;
  }

  public List<String> getAttacks() {
    return attacks;
  }

  public Double getValueOfStrongestAttack() {
    return ValueOfStrongestAttack;
  }

  public LocalDate getDateOfLastBattle() {
    return dateOfLastBattle;
  }

  @Override
  public Double estimateCaptureLikelihood() {
    if (attacks.size() > ATTACKS_THRESHOLD) {
      return super.estimateCaptureLikelihood() * SINGLE_POWER_CAPTURE_DECREASE;
    } else if (dateOfLastBattle.isAfter(
        dateOfLastBattle.minusDays(DATE_OF_LAST_BATTLE_THRESHOLD))) {
      return super.estimateCaptureLikelihood() * SINGLE_POWER_BATTLE_INCREASE;
    } else {
      return super.estimateCaptureLikelihood();
    }
  }
}
