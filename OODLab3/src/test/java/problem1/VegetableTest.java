package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VegetableTest {

  private Vegetable testVegetable;

  @BeforeEach
  void setUp() {
    testVegetable = new Vegetable("Bell Peppers", 1.29, 75, LocalDate.now(),
        LocalDate.of(2025, 6, 1));
  }

  @Test
  void testToString() {
    String expectedString = "Vegetable{" +
        "orderDate=" + testVegetable.getOrderDate() +
        ", expiryDate=" + testVegetable.getExpiryDate() +
        ", name='" + testVegetable.getName() + '\'' +
        ", currPricePerUnit=" + testVegetable.getCurrPricePerUnit() +
        ", availableQuantity=" + testVegetable.getAvailableQuantity() +
        '}';
    assertEquals(expectedString, testVegetable.toString());
  }
}