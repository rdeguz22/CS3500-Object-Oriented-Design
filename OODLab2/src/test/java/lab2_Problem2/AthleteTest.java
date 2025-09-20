package lab2_Problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AthleteTest {

  private Athlete rico;
  private Name ricardo;

  @BeforeEach
  void setup() {
    ricardo = new Name("Ricardo", "Paras", "de Guzman");
    rico = new Athlete(ricardo, 67.0, 160.0, "MLB");
  }

  @Test
  void getAthletesName() {
    assertEquals(new Name("Ricardo", "Paras", "de Guzman"), rico.getAthletesName());
  }

  @Test
  void getHeight() {
    assertEquals(67.0, rico.getHeight());
  }

  @Test
  void getWeight() {
    assertEquals(160.0, rico.getWeight());
  }

  @Test
  void getLeague() {
    assertEquals("MLB", rico.getLeague());
  }
}