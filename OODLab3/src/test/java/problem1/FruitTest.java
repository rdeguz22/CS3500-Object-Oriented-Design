package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FruitTest {

  private Fruit testFruit;
  private Fruit anotherFruit;

  @BeforeEach
  void setUp() {
    testFruit = new Fruit("Cosmic Crisp Apples", 3.99, 55, LocalDate.now(),
        LocalDate.of(2025, 8, 20));
    anotherFruit = new Fruit("Cosmic Crisp Apples", 3.99, 55, LocalDate.now(),
        LocalDate.of(2025, 8, 20));
  }

  @Test
  void getOrderDate() {
    assertEquals(LocalDate.now(), testFruit.getOrderDate());
  }

  @Test
  void getExpiryDate() {
    assertEquals(LocalDate.of(2025, 8, 20), testFruit.getExpiryDate());
  }

  @Test
  void getName() {
    assertEquals("Cosmic Crisp Apples", testFruit.getName());
  }

  @Test
  void getCurrPricePerUnit() {
    assertEquals(3.99, testFruit.getCurrPricePerUnit(), 0);
  }

  @Test
  void getAvailableQuantity() {
    assertEquals(55, testFruit.getAvailableQuantity(), 0);
  }

  @Test
  void testEqualsSameObject() {
    assertEquals(testFruit, testFruit);
  }

  @Test
  void testEqualsNull() {
    assertNotEquals(testFruit, null);
  }

  @Test
  void testEqualsDifferentDataType() {
    assertNotEquals(testFruit, new Object());
  }

  @Test
  void testEqualsDifferentInstance() {
    assertEquals(testFruit, anotherFruit);
  }

  @Test
  void testEqualsDifferentName() {
    anotherFruit = new Fruit("Fuji Apples", 3.99, 55, LocalDate.now(), LocalDate.of(2025, 8, 20));
    assertNotEquals(testFruit, anotherFruit);
  }

  @Test
  void testEqualsDifferentPrice() {
    anotherFruit = new Fruit("Cosmic Crisp Apples", 2.99, 55, LocalDate.now(),
        LocalDate.of(2025, 8, 20));
    assertNotEquals(testFruit, anotherFruit);
  }

  @Test
  void testEqualsDifferentQuantity() {
    anotherFruit = new Fruit("Cosmic Crisp Apples", 3.99, 65, LocalDate.now(),
        LocalDate.of(2025, 8, 20));
    assertNotEquals(testFruit, anotherFruit);
  }

  @Test
  void testEqualsDifferentOrderDate() {
    anotherFruit = new Fruit("Cosmic Crisp Apples", 3.99, 55, LocalDate.of(2025, 6, 1),
        LocalDate.of(2025, 8, 20));
    assertNotEquals(testFruit, anotherFruit);
  }

  @Test
  void testEqualsDifferentExpiryDate() {
    anotherFruit = new Fruit("Cosmic Crisp Apples", 3.99, 55, LocalDate.now(),
        LocalDate.of(2025, 8, 31));
    assertNotEquals(testFruit, anotherFruit);
  }


  @Test
  void testHashCode() {
    int expectedHashCode = Objects.hash(Objects.hash(testFruit.getName(),
            testFruit.getCurrPricePerUnit(), testFruit.getAvailableQuantity()),
        testFruit.getOrderDate(), testFruit.getExpiryDate());
    assertEquals(expectedHashCode, testFruit.hashCode());
  }

  @Test
  void testToString() {
    String expectedString = "Fruit{" +
        "orderDate=" + testFruit.getOrderDate() +
        ", expiryDate=" + testFruit.getExpiryDate() +
        ", name='" + testFruit.getName() + '\'' +
        ", currPricePerUnit=" + testFruit.getCurrPricePerUnit() +
        ", availableQuantity=" + testFruit.getAvailableQuantity() +
        '}';
    assertEquals(expectedString, testFruit.toString());
  }
}