package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RiceTest {

  private Rice testRice;

  @BeforeEach
  void setUp() {
    testRice = new Rice("Jasmine rice", 2.55, 125);
  }

  @Test
  void testToString() {
    String expectedString = "Rice{" +
        "name='" + testRice.getName() + '\'' +
        ", currPricePerUnit=" + testRice.getCurrPricePerUnit() +
        ", availableQuantity=" + testRice.getAvailableQuantity() +
        '}';
    assertEquals(expectedString, testRice.toString());
  }
}