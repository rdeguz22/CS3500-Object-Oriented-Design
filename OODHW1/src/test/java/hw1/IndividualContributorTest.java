package hw1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IndividualContributorTest {

  private IndividualContributor employee1;
  private IndividualContributor employee2;
  private IndividualContributor employee3;
  private IndividualContributor employee4;
  private IndividualContributor employee5;
  private ContactInfo contact;

  @BeforeEach
  void setUp() {
    Name name = new Name("Rico", "deGuzman");
    Name emergency = new Name("Ricardo", "deGuzman");
    contact = new ContactInfo(name, "1000 Lenora St.", "203-919-5136",
        "deguzman.r@northeastern.edu", emergency);
    employee1 = new IndividualContributor("FT200", contact, LocalDate.of(2021, 2, 1),
        EmploymentLevel.ENTRY_LEVEL, 80000.0, 60000.0, 7000.0, 3000.0, LocalDate.of(2023, 1, 1), 3,
        1, 6, 2);
    employee2 = new IndividualContributor("FT200", contact, LocalDate.of(2021, 2, 1),
        EmploymentLevel.INTERMEDIATE_LEVEL, 80000.0, 60000.0, 7000.0, 3000.0,
        LocalDate.of(2023, 1, 1), 3,
        1, 6, 2);
    employee3 = new IndividualContributor("FT200", contact, LocalDate.of(2021, 2, 1),
        EmploymentLevel.ENTRY_LEVEL, 80000.0, 60000.0, 7000.0, 3000.0, LocalDate.of(2023, 1, 1), 1,
        1, 6, 2);
    employee4 = new IndividualContributor("FT200", contact, LocalDate.of(2017, 2, 1),
        EmploymentLevel.ENTRY_LEVEL, 80000.0, 60000.0, 7000.0, 3000.0, LocalDate.of(2018, 1, 1), 3,
        1, 6, 2);
    employee5 = new IndividualContributor("FT200", contact, LocalDate.of(2021, 2, 1),
        EmploymentLevel.ENTRY_LEVEL, 80000.0, 60000.0, 7000.0, 3000.0, LocalDate.of(2023, 1, 1), 3,
        1, 3, 2);
  }

  @Test
  void testGetEmployeeID() {
    assertEquals("FT200", employee1.employeeID);
  }

  @Test
  void testGetContactInfo() {
    assertEquals(contact, employee1.getContactInfo());
  }

  @Test
  void testGetEmploymentDate() {
    assertEquals(LocalDate.of(2021, 2, 1), employee1.getEmploymentDate());
  }

  @Test
  void testGetEmploymentLevel() {
    assertEquals(EmploymentLevel.ENTRY_LEVEL, employee1.getEmploymentLevel());
    assertEquals(EmploymentLevel.INTERMEDIATE_LEVEL, employee2.getEmploymentLevel());
  }

  @Test
  void testGetLastYearsEarnings() {
    assertEquals(80000.0, employee1.getLastYearsEarnings());
  }

  @Test
  void testGetBasePay() {
    assertEquals(60000.0, employee1.getBasePay());
  }

  @Test
  void testGetBonuses() {
    assertEquals(7000.0, employee1.getBonuses());
  }

  @Test
  void testGetOvertime() {
    assertEquals(3000.0, employee1.getOvertime());
  }

  @Test
  void testGetLastPromotion() {
    assertEquals(LocalDate.of(2023, 1, 1), employee1.getLastPromotionDate());
    assertEquals(LocalDate.of(2018, 1, 1), employee4.getLastPromotionDate());
  }

  @Test
  void testGetNumberOfProjects() {
    assertEquals(3, employee1.getNumberOfProjects());
    assertEquals(1, employee3.getNumberOfProjects());
  }

  @Test
  void getNumberOfPatents() {
    assertEquals(1, employee1.getNumberOfPatents());
  }

  @Test
  void getNumberOfPublications() {
    assertEquals(6, employee1.getNumberOfPublications());
    assertEquals(3, employee5.getNumberOfProjects());
  }

  @Test
  void getNumberOfExternalCollaborations() {
    assertEquals(2, employee1.getNumberOfExternalCollaborations());
  }

  @Test
  void estimateProductivity() {
    assertEquals(4.133, employee1.estimateProductivity(), 0.1);
    assertEquals(5.533, employee2.estimateProductivity(), 0.1);
    assertEquals(2.633, employee3.estimateProductivity(), 0.1);
    assertEquals(3.333, employee4.estimateProductivity(), 0.1);
    assertEquals(2.833, employee5.estimateProductivity(), 0.1);
  }
}