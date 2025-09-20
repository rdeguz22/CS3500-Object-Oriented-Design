package lab2_Problem2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BaseballPlayerTest {

  private BaseballPlayer rico;
  private Name ricardo;

  @BeforeEach
  void setup() {
    ricardo = new Name("Ricardo", "Paras", "de Guzman");
    rico = new BaseballPlayer(ricardo, 67.0, 160.0, 0.250, 17, "Mets");
  }

  @Test
  void getAvgBattingScore() {
    assertEquals(0.250, rico.getAvgBattingScore());
  }

  @Test
  void getSeasonHomeRuns() {
    assertEquals(17, rico.getSeasonHomeRuns());
  }

  @Test
  void getTeamName() {
    assertEquals("Mets", rico.getTeamName());
  }
}