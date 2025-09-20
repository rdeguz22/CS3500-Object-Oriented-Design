package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PublicStrategyTest {

  private PublicStrategy strategy;

  @BeforeEach
  void setUp() {
    strategy = new PublicStrategy();
  }

  @Test
  void testAdoptStrategy() {
    assertDoesNotThrow(() -> strategy.adoptStrategy());
  }
}