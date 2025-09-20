package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthlyDonationTest {

  private MonthlyDonation donation;
  private LocalDateTime startDate;

  @BeforeEach
  void setUp() {
    startDate = LocalDateTime.of(2022, 3, 7, 12, 0);
    donation = new MonthlyDonation(10.0, startDate);
  }

  @Test
  void testGetAmount() {
    assertEquals(10.0, donation.getAmount());
  }

  @Test
  void testGetCreationDate() {
    assertEquals(LocalDateTime.of(2022, 3, 7, 12, 0), donation.getCreationDate());
  }

  @Test
  void getAmountForYearNoCancellation() {
    assertEquals(100.0, donation.getAmountForYear(2022), 0.001);
  }

  @Test
  void getAmountForYearWithCancellation() {
    donation.cancel(LocalDateTime.of(2022, 7, 7, 12, 0));
    assertEquals(50.0, donation.getAmountForYear(2022), 0.001);
  }

  @Test
  void getAmountForYearDifferentYear() {
    assertEquals(120.0, donation.getAmountForYear(2024), 0.001);
  }
}