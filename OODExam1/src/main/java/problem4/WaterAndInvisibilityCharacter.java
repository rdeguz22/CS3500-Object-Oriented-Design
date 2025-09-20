package problem4;

import java.util.List;

public class WaterAndInvisibilityCharacter extends MultiplePowerCharacter {

  private Boolean flag;
  private static final Double WATER_AND_INVISIBILITY_CAPTURE_DECREASE = 0.75;

  public WaterAndInvisibilityCharacter(String name, Double weight, Double height,
      List<String> regions, Double combatLevel, Double healthLevel, String primaryPower,
      List<String> specialAbilities, Boolean flag) {
    super(name, weight, height, regions, combatLevel, healthLevel, primaryPower, specialAbilities);
    this.flag = flag;
  }

  public Boolean getFlag() {
    return flag;
  }

  @Override
  public Double estimateCaptureLikelihood() {
    if (getFlag()) {
      return super.estimateCaptureLikelihood() * WATER_AND_INVISIBILITY_CAPTURE_DECREASE;
    }
    return super.estimateCaptureLikelihood();
  }
}
