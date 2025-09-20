package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FriendsOnlyStrategyTest {

  private FriendsOnlyStrategy strategy;

  @BeforeEach
  void setUp() {
    strategy = new FriendsOnlyStrategy();
  }

  @Test
  void testAdoptStrategy() {
    assertDoesNotThrow(() -> strategy.adoptStrategy());
  }
}