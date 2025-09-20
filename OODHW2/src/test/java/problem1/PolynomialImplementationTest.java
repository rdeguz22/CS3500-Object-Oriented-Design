package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PolynomialImplementationTest {

  private PolynomialImplementation poly1;
  private PolynomialImplementation poly2;
  private PolynomialImplementation poly3;

  @BeforeEach
  void setUp() {
    poly1 = new PolynomialImplementation();
    poly1.addTerm(3, 4);
    poly1.addTerm(-5, 2);
    poly1.addTerm(2, 1);
    poly1.addTerm(-4, 0);

    poly2 = new PolynomialImplementation();
    poly2.addTerm(2, 2);
    poly2.addTerm(2, 3);
    poly2.addTerm(4, 0);

    poly3 = new PolynomialImplementation();
    poly3.addTerm(3, 4);
    poly3.addTerm(-5, 2);
    poly3.addTerm(2, 1);
    poly3.addTerm(-4, 0);
  }

  @Test
  void testGetDegree() {
    assertEquals(4, poly1.getDegree());
    assertEquals(3, poly2.getDegree());
  }

  @Test
  void testGetCoefficient() {
    assertEquals(3, poly1.getCoefficient(4));
    assertEquals(-5, poly1.getCoefficient(2));
    assertEquals(0, poly1.getCoefficient(3));
  }

  @Test
  void testAddTerm() {
    poly1.addTerm(5, 2);
    assertEquals(0, poly1.getCoefficient(2));
  }

  @Test
  void testCompare() {
    assertTrue(poly1.compare(poly3));
    assertFalse(poly1.compare(poly2));
  }

  @Test
  void testEquals() {
    assertTrue(poly1.equals(poly3));
    assertFalse(poly1.equals(poly2));
  }

  @Test
  void testHashCode() {
    assertEquals(poly1.hashCode(), poly3.hashCode());
    assertNotEquals(poly1.hashCode(), poly2.hashCode());
  }
}