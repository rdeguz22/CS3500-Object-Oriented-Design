package lab2_Problem2;

import java.util.Objects;

public class BaseballPlayer extends Athlete {

  private Double avgBattingScore;
  private Integer seasonHomeRuns;
  private String teamName;

  /**
   * Constructor for the class Athlete.
   *
   * @param athletesName - String, representing athlete's name
   * @param height       - Double, representing athlete's height
   * @param weight       - Double, representing athlete's weight
   * @param league       - String, representing athlete's league
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String league,
      Double avgBattingScore, Integer seasonHomeRuns, String teamName) {
    super(athletesName, height, weight, league);
    this.avgBattingScore = avgBattingScore;
    this.seasonHomeRuns = seasonHomeRuns;
    this.teamName = teamName;
  }

  /**
   * Constructor for the class Athlete.
   *
   * @param athletesName - String, representing athlete's name
   * @param height       - Double, representing athlete's height
   * @param weight       - Double, representing athlete's weight
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, Double avgBattingScore,
      Integer seasonHomeRuns, String teamName) {
    super(athletesName, height, weight);
    this.avgBattingScore = avgBattingScore;
    this.seasonHomeRuns = seasonHomeRuns;
    this.teamName = teamName;
  }

  /**
   * @return - Double, giving batter's average
   **/
  public Double getAvgBattingScore() {
    return avgBattingScore;
  }

  /**
   * @return - Integer, giving player's home runs throughout the season
   **/
  public Integer getSeasonHomeRuns() {
    return seasonHomeRuns;
  }

  /**
   * @return - String, giving player's team's name
   **/
  public String getTeamName() {
    return teamName;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    BaseballPlayer that = (BaseballPlayer) o;
    return Objects.equals(avgBattingScore, that.avgBattingScore)
        && Objects.equals(seasonHomeRuns, that.seasonHomeRuns) && Objects.equals(
        teamName, that.teamName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), avgBattingScore, seasonHomeRuns, teamName);
  }
}