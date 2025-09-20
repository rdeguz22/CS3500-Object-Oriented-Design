package lab2_Problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunnerTest {

  private Runner rico;
  private Name ricardo;

  @BeforeEach
  void setUp() {
    ricardo = new Name("Ricardo", "Paras", "de Guzman");
    rico = new Runner(ricardo, 67.0, 160.0, 25.0, 90.0, "5k");
  }

  @Test
  void getBest5KTime() {
    assertEquals(25.0, rico.getBest5KTime());
  }

  @Test
  void getBestHalfMarathonTime() {
    assertEquals(90.0, rico.getBestHalfMarathonTime());
  }

  @Test
  void getFavoriteRunningEvent() {
    assertEquals("5k", rico.getFavoriteRunningEvent());
  }
}