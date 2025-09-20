package lab2_Problem2;

import java.util.Objects;

public class Runner extends Athlete {

  private Double best5KTime;
  private Double bestHalfMarathonTime;
  private String favoriteRunningEvent;

  /**
   * Constructor for the class Athlete.
   *
   * @param athletesName - String, representing athlete's name
   * @param height       - Double, representing athlete's height
   * @param weight       - Double, representing athlete's weight
   * @param league       - String, representing athlete's league
   */
  public Runner(Name athletesName, Double height, Double weight, String league, Double best5KTime,
      Double bestHalfMarathonTime, String favoriteRunningEvent) {
    super(athletesName, height, weight, league);
    this.best5KTime = best5KTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favoriteRunningEvent = favoriteRunningEvent;
  }

  /**
   * Constructor for the class Athlete.
   *
   * @param athletesName - String, representing athlete's name
   * @param height       - Double, representing athlete's height
   * @param weight       - Double, representing athlete's weight
   */
  public Runner(Name athletesName, Double height, Double weight, Double best5KTime,
      Double bestHalfMarathonTime, String favoriteRunningEvent) {
    super(athletesName, height, weight);
    this.best5KTime = best5KTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favoriteRunningEvent = favoriteRunningEvent;
  }

  /**
   * @return - Double, giving runner's best 5k time
   **/
  public Double getBest5KTime() {
    return best5KTime;
  }

  /**
   * @return - Double, giving runner's best half marathon time
   **/
  public Double getBestHalfMarathonTime() {
    return bestHalfMarathonTime;
  }

  /**
   * @return - String, giving runner's favorite running event
   **/
  public String getFavoriteRunningEvent() {
    return favoriteRunningEvent;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Runner runner = (Runner) o;
    return Objects.equals(best5KTime, runner.best5KTime) && Objects.equals(
        bestHalfMarathonTime, runner.bestHalfMarathonTime) && Objects.equals(
        favoriteRunningEvent, runner.favoriteRunningEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), best5KTime, bestHalfMarathonTime, favoriteRunningEvent);
  }
}