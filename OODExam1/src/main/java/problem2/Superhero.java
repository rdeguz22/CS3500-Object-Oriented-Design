package problem2;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Superhero {

  private static final Double COMBAT_POWER_LIMIT = 0.0;
  private static final Double MIN_WEALTH_LEVEL = 0.0;
  private static final Double MAX_WEALTH_LEVEL = 100.0;
  private Name name;
  private Integer age;
  private Double height;
  private Double weight;
  private List<String> powers;
  private List<String> attacks;
  private LocalDate dateOfLastBattle;
  protected Double combatPower;
  protected Double healthLevel;
  private static final Double ABILITY_THRESHOLD = 10.0;
  private static final long DAYS_THRESHOLD = 20;

  /**
   * Constructor for class Superhero
   *
   * @param name             the name, represented as Name
   * @param age              the age, represented as Integer
   * @param height           the height, represented as Double
   * @param weight           the weight, represented as Double
   * @param powers           the powers, represented as List<String>
   * @param attacks          the attacks, represented as List<String>
   * @param dateOfLastBattle the date of last battle, represented as LocalDate
   * @param combatPower      the combat power, represented as Double
   * @param healthLevel      the health level, represented as Double
   */
  public Superhero(Name name, Integer age, Double height, Double weight, List<String> powers,
      List<String> attacks, LocalDate dateOfLastBattle, Double combatPower, Double healthLevel) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.powers = powers;
    this.attacks = attacks;
    this.dateOfLastBattle = dateOfLastBattle;
    this.combatPower = combatPower;
    this.healthLevel = healthLevel;
  }

  public Name getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public Double getHeight() {
    return height;
  }

  public Double getWeight() {
    return weight;
  }

  public List<String> getPowers() {
    return powers;
  }

  public List<String> getAttacks() {
    return attacks;
  }

  public LocalDate getDateOfLastBattle() {
    return dateOfLastBattle;
  }

  public Double getCombatPower() {
    return combatPower;
  }

  public Double getHealthLevel() {
    return healthLevel;
  }

  //YOUR CODE HERE
  public void addNewAbility(String ability) throws InvalidAbilityException {
    if (powers.contains(ability)) {
      throw new InvalidAbilityException("Ability already exists.");
    }
    if (powers.size() > ABILITY_THRESHOLD) {
      throw new InvalidAbilityException("Already have the maximum amount of abilities.");
    }
    if (!powers.contains(ability) || powers.size() < ABILITY_THRESHOLD) {
      powers.add(ability);
    }
  }

  //YOUR CODE HERE
  public Boolean updateDateOfLastBattle(LocalDate dateOfLastBattle) {
    if (this.dateOfLastBattle.isAfter(dateOfLastBattle.minusDays(DAYS_THRESHOLD))) {
      this.dateOfLastBattle = dateOfLastBattle;
      return true;
    }
    return false;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Superhero superhero = (Superhero) o;
    return Objects.equals(name, superhero.name) && Objects.equals(age,
        superhero.age) && Objects.equals(height, superhero.height)
        && Objects.equals(weight, superhero.weight) && Objects.equals(powers,
        superhero.powers) && Objects.equals(attacks, superhero.attacks)
        && Objects.equals(dateOfLastBattle, superhero.dateOfLastBattle)
        && Objects.equals(combatPower, superhero.combatPower) && Objects.equals(
        healthLevel, superhero.healthLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, height, weight, powers, attacks, dateOfLastBattle, combatPower,
        healthLevel);
  }
}
