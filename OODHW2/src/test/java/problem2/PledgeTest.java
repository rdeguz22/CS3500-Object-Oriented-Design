package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PledgeTest {

  private Pledge pledge1;
  private Pledge pledge2;
  private LocalDateTime creationDate;
  private LocalDateTime processingDate;

  @BeforeEach
  void setUp() {
    creationDate = LocalDateTime.of(2024, 1, 10, 10, 0);
    processingDate = LocalDateTime.of(2024, 12, 10, 10, 0);
    pledge1 = new Pledge(500.0, creationDate, processingDate);
    pledge2 = new Pledge(500.0, creationDate);
  }

  @Test
  void testGetAmount() {
    assertEquals(500.0, pledge1.getAmount(), 0.001);
  }

  @Test
  void testGetCreationDate() {
    assertEquals(LocalDateTime.of(2024, 1, 10, 10, 0), pledge1.getCreationDate());
  }

  @Test
  void testGetProcessingDate() {
    assertEquals(LocalDateTime.of(2024, 12, 10, 10, 0), pledge1.getProcessingDate());
    assertNull(pledge2.getProcessingDate());
  }

  @Test
  void testGetAmountForYearWithProcessingDate() {
    assertEquals(500.0, pledge1.getAmountForYear(2024), 0.001);
  }

  @Test
  void testGetAmountForYearNoProcessingDate() {
    pledge1.removeProcessingDate();
    assertEquals(0.0, pledge1.getAmountForYear(2024), 0.001);
    assertEquals(0.0, pledge2.getAmountForYear(2024), 0.001);
  }
}