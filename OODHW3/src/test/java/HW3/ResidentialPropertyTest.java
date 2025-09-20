package HW3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResidentialPropertyTest {

  private ResidentialProperty property;

  @BeforeEach
  void setUp() {
    property = new ResidentialProperty("1000 Lenora St.", 5000, 3, 2.5);
  }

  @Test
  void testGetAddress() {
    assertEquals("1000 Lenora St.", property.getAddress());

  }

  @Test
  void testGetSize() {
    assertEquals(5000, property.getSize());
  }

  @Test
  void testGetNumBedrooms() {
    assertEquals(3, property.getNumBedrooms());
  }

  @Test
  void testGetNumBathrooms() {
    assertEquals(2.5, property.getNumBathrooms());
  }
}