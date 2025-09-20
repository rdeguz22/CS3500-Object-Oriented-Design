package problem4;

import java.util.List;
import java.util.Objects;

public abstract class Character {

  private String name;
  private Double weight;
  private Double height;
  private List<String> regions;
  private Double combatLevel;
  private Double healthLevel;


  public Character(String name, Double weight, Double height, List<String> regions,
      Double combatLevel, Double healthLevel) {
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.regions = regions;
    this.combatLevel = combatLevel;
    this.healthLevel = healthLevel;
  }

  public String getName() {
    return name;
  }

  public Double getWeight() {
    return weight;
  }

  public Double getHeight() {
    return height;
  }

  public List<String> getRegions() {
    return regions;
  }

  public Double getCombatLevel() {
    return combatLevel;
  }

  public Double getHealthLevel() {
    return healthLevel;
  }

  public Double estimateCaptureLikelihood() {
    return combatLevel / healthLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Character character = (Character) o;
    return Objects.equals(name, character.name) && Objects.equals(weight,
        character.weight) && Objects.equals(height, character.height)
        && Objects.equals(regions, character.regions) && Objects.equals(
        combatLevel, character.combatLevel) && Objects.equals(healthLevel,
        character.healthLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, weight, height, regions, combatLevel, healthLevel);
  }
}
