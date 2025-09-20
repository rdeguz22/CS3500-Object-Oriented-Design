package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NonprofitTest {

  private Nonprofit nonprofit;

  @BeforeEach
  void setUp() {
    nonprofit = new Nonprofit("The NonProfit");
  }

  @Test
  void getName() {
    assertEquals("The NonProfit", nonprofit.getName());
  }

  @Test
  void getTotalDonationsForYear() {
    nonprofit.addDonation(new OneTimeDonation(100.0, LocalDateTime.of(2025, 5, 2, 10, 0)));
    nonprofit.addDonation(new MonthlyDonation(10.0, LocalDateTime.of(2025, 7, 1, 12, 0)));
    assertEquals(160.0, nonprofit.getTotalDonationsForYear(2025));
  }
}