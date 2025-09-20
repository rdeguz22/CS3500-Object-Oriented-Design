package hw1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerTest {

  private Manager manager1;
  private Manager manager2;
  private Manager manager3;
  private Manager manager4;
  private Manager manager5;
  private ContactInfo contact;

  @BeforeEach
  void setUp() {
    Name name = new Name("Rico", "deGuzman");
    Name emergency = new Name("Ricardo", "deGuzman");
    contact = new ContactInfo(name, "1000 Lenora St.", "203-919-5136",
        "deguzman.r@northeastern.edu", emergency);
    manager1 = new Manager("FT100", contact, LocalDate.of(2018, 5, 25),
        EmploymentLevel.INTERMEDIATE_LEVEL, 150000.0, 100000.0, 15000.0, 10000.0,
        LocalDate.of(2019, 4, 1), 5, 12);
    manager2 = new Manager("FT100", contact, LocalDate.of(2018, 5, 25),
        EmploymentLevel.MID_LEVEL, 150000.0, 100000.0, 15000.0, 10000.0,
        LocalDate.of(2019, 4, 1), 5, 12);
    manager3 = new Manager("FT100", contact, LocalDate.of(2018, 5, 25),
        EmploymentLevel.MID_LEVEL, 150000.0, 100000.0, 15000.0, 10000.0,
        LocalDate.of(2019, 4, 1), 1, 12);
    manager4 = new Manager("FT100", contact, LocalDate.of(2018, 5, 25),
        EmploymentLevel.MID_LEVEL, 150000.0, 100000.0, 15000.0, 10000.0,
        LocalDate.of(2023, 4, 1), 5, 12);
    manager5 = new Manager("FT100", contact, LocalDate.of(2018, 5, 25),
        EmploymentLevel.MID_LEVEL, 150000.0, 100000.0, 15000.0, 10000.0,
        LocalDate.of(2019, 4, 1), 5, 4);
  }

  @Test
  void testGetEmployeeID() {
    assertEquals("FT100", manager1.employeeID);
  }

  @Test
  void testGetContactInfo() {
    assertEquals(contact, manager1.getContactInfo());
  }

  @Test
  void testGetEmploymentDate() {
    assertEquals(LocalDate.of(2018, 5, 25), manager1.getEmploymentDate());
  }

  @Test
  void testGetEmploymentLevel() {
    assertEquals(EmploymentLevel.INTERMEDIATE_LEVEL, manager1.getEmploymentLevel());
    assertEquals(EmploymentLevel.MID_LEVEL, manager2.getEmploymentLevel());
  }

  @Test
  void testGetLastYearsEarnings() {
    assertEquals(150000.0, manager1.getLastYearsEarnings());
  }

  @Test
  void testGetBasePay() {
    assertEquals(100000.0, manager1.getBasePay());
  }

  @Test
  void testGetBonuses() {
    assertEquals(15000.0, manager1.getBonuses());
  }

  @Test
  void testGetOvertime() {
    assertEquals(10000.0, manager1.getOvertime());
  }

  @Test
  void testGetLastPromotion() {
    assertEquals(LocalDate.of(2019, 4, 1), manager1.getLastPromotionDate());
    assertEquals(LocalDate.of(2023, 4, 1), manager4.getLastPromotionDate());
  }

  @Test
  void testGetNumberOfProjects() {
    assertEquals(5, manager1.getNumberOfProjects());
    assertEquals(1, manager3.getNumberOfProjects());
  }

  @Test
  void getNumberOfEmployeesManaged() {
    assertEquals(12, manager1.getNumberOfEmployeesManaged());
    assertEquals(4, manager5.getNumberOfEmployeesManaged());
  }

  @Test
  void testEstimateProductivity() {
    assertEquals(5.4, manager1.estimateProductivity(), 0.1);
    assertEquals(4.0, manager2.estimateProductivity(), 0.1);
    assertEquals(2.5, manager3.estimateProductivity(), 0.1);
    assertEquals(4.8, manager4.estimateProductivity(), 0.1);
    assertEquals(2.2, manager5.estimateProductivity(), 0.1);
  }

  @Test
  void testEquals() {
    assertTrue(manager1.equals(manager2));
  }

  @Test
  void testHashCode() {
    assertEquals(12, manager1.hashCode());
  }
}