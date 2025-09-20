package HW3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommercialPropertyTest {

  private CommercialProperty property;

  @BeforeEach
  void setUp() {
    property = new CommercialProperty("1000 Lenora St.", 100000, 15, true);
  }

  @Test
  void testGetAddress() {
    assertEquals("1000 Lenora St.", property.getAddress());
  }

  @Test
  void testGetSize() {
    assertEquals(100000, property.getSize());
  }

  @Test
  void testGetNumOffices() {
    assertEquals(15, property.getNumOffices());
  }

  @Test
  void testGetSuitableForRetail() {
    assertEquals(true, property.getSuitableForRetail());
  }
}