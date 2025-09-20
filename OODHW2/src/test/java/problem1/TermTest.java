package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TermTest {

  private Term term1;
  private Term term2;
  private Term term3;

  @BeforeEach
  void setUp() {
    term1 = new Term(3, 4);
    term2 = new Term(-5, 2);
    term3 = new Term(3, 4);
  }

  @Test
  void testGetCoefficient() {
    assertEquals(3, term1.getCoefficient());
    assertEquals(-5, term2.getCoefficient());
  }

  @Test
  void testGetPower() {
    assertEquals(4, term1.getPower());
    assertEquals(2, term2.getPower());
  }

  @Test
  void testGetNext() {
    assertNull(term1.getNext());
  }

  @Test
  void testEquals() {
    assertTrue(term1.equals(term3));
  }

  @Test
  void testHashCode() {
    assertEquals(term1.hashCode(), term3.hashCode());
    assertNotEquals(term1.hashCode(), term2.hashCode());
  }
}