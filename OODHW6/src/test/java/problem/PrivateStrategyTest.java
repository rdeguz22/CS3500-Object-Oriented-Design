package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrivateStrategyTest {

  private PrivateStrategy strategy;

  @BeforeEach
  void setUp() {
    strategy = new PrivateStrategy();
  }

  @Test
  void testAdoptStrategy() {
    assertDoesNotThrow(() -> strategy.adoptStrategy());
  }
}