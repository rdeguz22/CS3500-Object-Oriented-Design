package hw1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BenefitsEligibleEmployeeTest {

  private BenefitsEligibleEmployee employee1;
  private BenefitsEligibleEmployee employee2;
  private ContactInfo contact;

  @BeforeEach
  void setup() {
    Name name = new Name("Rico", "deGuzman");
    Name emergency = new Name("Ricardo", "deGuzman");
    contact = new ContactInfo(name, "1000 Lenora St.", "203-919-5136",
        "deguzman.r@northeastern.edu", emergency);
    employee1 = new BenefitsEligibleEmployee("PT100", contact, LocalDate.of(2024, 3, 1),
        EmploymentLevel.MID_LEVEL,
        30000.0, 20.0, 18.0, 2500.0);
    employee2 = new BenefitsEligibleEmployee("PT100", contact, LocalDate.of(2024, 3, 1),
        EmploymentLevel.INTERMEDIATE_LEVEL,
        30000.0, 20.0, 18.0, 2500.0);
  }

  @Test
  void testGetEmployeeID() {
    assertEquals("PT100", employee1.employeeID);
  }

  @Test
  void testGetContactInfo() {
    assertEquals(contact, employee1.getContactInfo());
  }

  @Test
  void testGetEmploymentDate() {
    assertEquals(LocalDate.of(2024, 3, 01), employee1.getEmploymentDate());
  }

  @Test
  void testGetEmploymentLevel() {
    assertEquals(EmploymentLevel.MID_LEVEL, employee1.getEmploymentLevel());
    assertEquals(EmploymentLevel.INTERMEDIATE_LEVEL, employee2.getEmploymentLevel());
  }

  @Test
  void testGetLastYearsEarnings() {
    assertEquals(30000.0, employee1.getLastYearsEarnings());
  }

  @Test
  void testGetContractualHours() {
    assertEquals(20.0, employee1.getContractualHours());
  }

  @Test
  void testGetActualWorkedHours() {
    assertEquals(18.0, employee1.getActualWorkedHours());
  }

  @Test
  void testGetBonusOvertimeEarnings() {
    assertEquals(2500.0, employee1.getBonusOvertimeEarnings());
  }

  @Test
  void testEstimateProductivity() {
    assertEquals(3.33, employee1.estimateProductivity());
    assertEquals(4.73, employee2.estimateProductivity());
  }
}