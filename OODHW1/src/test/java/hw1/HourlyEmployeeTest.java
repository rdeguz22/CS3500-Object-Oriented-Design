package hw1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HourlyEmployeeTest {

  private HourlyEmployee employee1;
  private HourlyEmployee employee2;
  private HourlyEmployee employee3;
  private ContactInfo contact;

  @BeforeEach
  void setup() {
    Name name = new Name("Rico", "deGuzman");
    Name emergency = new Name("Ricardo", "deGuzman");
    contact = new ContactInfo(name, "1000 Lenora St.", "203-919-5136",
        "deguzman.r@northeastern.edu", emergency);
    employee1 = new HourlyEmployee("PT200", contact, LocalDate.of(2024, 6, 1),
        EmploymentLevel.SENIOR_LEVEL, 12000.0, 15.0, 16.0, 500.0, 30.0);
    employee2 = new HourlyEmployee("PT200", contact, LocalDate.of(2024, 6, 1),
        EmploymentLevel.INTERMEDIATE_LEVEL, 12000.0, 15.0, 16.0, 500.0, 30.0);
    employee3 = new HourlyEmployee("PT200", contact, LocalDate.of(2024, 6, 1),
        EmploymentLevel.SENIOR_LEVEL, 12000.0, 15.0, 16.0, 500.0, 12.0);
  }

  @Test
  void testGetEmployeeID() {
    assertEquals("PT200", employee1.employeeID);
  }

  @Test
  void testGetContactInfo() {
    assertEquals(contact, employee1.getContactInfo());
  }

  @Test
  void testGetEmploymentDate() {
    assertEquals(LocalDate.of(2024, 6, 1), employee1.getEmploymentDate());
  }

  @Test
  void testGetEmploymentLevel() {
    assertEquals(EmploymentLevel.SENIOR_LEVEL, employee1.getEmploymentLevel());
    assertEquals(EmploymentLevel.INTERMEDIATE_LEVEL, employee2.getEmploymentLevel());
  }

  @Test
  void testGetLastYearsEarnings() {
    assertEquals(12000.0, employee1.getLastYearsEarnings());
  }

  @Test
  void testGetContractualHours() {
    assertEquals(15.0, employee1.getContractualHours());
  }

  @Test
  void testGetActualWorkedHours() {
    assertEquals(16.0, employee1.getActualWorkedHours());
  }

  @Test
  void testGetBonusOvertimeEarnings() {
    assertEquals(500.0, employee1.getBonusOvertimeEarnings());
  }

  @Test
  void getHourlyRate() {
    assertEquals(30.0, employee1.getHourlyRate());
    assertEquals(12.0, employee3.getHourlyRate());
  }

  @Test
  void estimateProductivity() {
    assertEquals(3.95, employee1.estimateProductivity(), 0.1);
    assertEquals(5.346, employee2.estimateProductivity(), 0.1);
    assertEquals(6.946, employee3.estimateProductivity(), 0.1);
  }
}