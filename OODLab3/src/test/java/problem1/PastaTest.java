package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PastaTest {

  private Pasta testPasta;
  private Pasta anotherPasta;

  @BeforeEach
  void setUp() {
    testPasta = new Pasta("Spaghetti", 2.15, 135);
    anotherPasta = new Pasta("Spaghetti", 2.15, 135);
  }

  @Test
  void testEqualsTestWithItself() {
    assertTrue(testPasta.equals(testPasta));
  }

  @Test
  void testEqualsTestWithNull() {
    assertFalse(testPasta.equals(null));
  }

  @Test
  void testEqualsTestWithDifferentObject() {
    assertFalse(testPasta.equals(new Object()));
  }

  @Test
  void testEqualsTestWithDifferentObjectSameFields() {
    assertTrue(testPasta.equals(anotherPasta));
  }

  @Test
  void testEqualsTestWithDifferentObjectDifferentName() {
    anotherPasta = new Pasta("Tortellini", 2.15, 135);
    assertFalse(testPasta.equals(anotherPasta));
  }

  @Test
  void testEqualsTestWithDifferentObjectDifferentPrice() {
    anotherPasta = new Pasta("Spaghetti", 2.45, 135);
    assertFalse(testPasta.equals(anotherPasta));
  }

  @Test
  void testEqualsTestWithDifferentObjectDifferentQuantity() {
    anotherPasta = new Pasta("Spaghetti", 2.15, 155);
    assertFalse(testPasta.equals(anotherPasta));
  }

  @Test
  void testHashCode() {
    int expectedHashCode = Objects.hash(testPasta.getName(), testPasta.getCurrPricePerUnit(),
        testPasta.getAvailableQuantity());
    assertEquals(expectedHashCode, testPasta.hashCode());
  }

  @Test
  void testToString() {
    int i = 100;
    String expectedString = "Pasta{" +
        "name='" + testPasta.getName() + '\'' +
        ", currPricePerUnit=" + testPasta.getCurrPricePerUnit() +
        ", availableQuantity=" + testPasta.getAvailableQuantity() +
        '}';
    assertEquals(expectedString, testPasta.toString());
  }
}