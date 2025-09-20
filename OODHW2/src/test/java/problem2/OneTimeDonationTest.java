package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OneTimeDonationTest {

  private OneTimeDonation donation1;
  private LocalDateTime date;
  private OneTimeDonation donation2;

  @BeforeEach
  void setUp() {
    date = LocalDateTime.of(2021, 3, 22, 10, 0);
    donation1 = new OneTimeDonation(100.0, date);
    donation2 = new OneTimeDonation(200.0, date);
  }

  @Test
  void testGetAmount() {
    assertEquals(100.0, donation1.getAmount());
  }

  @Test
  void testGetCreationDate() {
    assertEquals(LocalDateTime.of(2021, 3, 22, 10, 0), donation1.getCreationDate());
  }

  @Test
  void testGetAmountForYear() {
    assertEquals(100.0, donation1.getAmountForYear(2021));
  }

  @Test
  void testEquals() {
    assertFalse(donation1.equals(donation2));
  }

  @Test
  void testHashCode() {
    assertNotEquals(donation1.hashCode(), donation2.hashCode());
  }
}