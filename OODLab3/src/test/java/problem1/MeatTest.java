package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MeatTest {

  private Meat testMeat;

  @BeforeEach
  void setUp() throws Exception {
    testMeat = new Meat("Chicken", 3.55, 75, LocalDate.now(), LocalDate.of(2025, 6, 1));
  }

  @Test
  void testToString() {
    String expectedString = "Meat{" +
        "orderDate=" + testMeat.getOrderDate() +
        ", expiryDate=" + testMeat.getExpiryDate() +
        ", name='" + testMeat.getName() + '\'' +
        ", currPricePerUnit=" + testMeat.getCurrPricePerUnit() +
        ", availableQuantity=" + testMeat.getAvailableQuantity() +
        '}';
    assertEquals(expectedString, testMeat.toString());
  }
}