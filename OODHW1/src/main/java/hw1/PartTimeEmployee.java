package hw1;

import java.time.LocalDate;

/**
 * Class PartTimeEmployee stores information about a part-time employee.
 **/

public abstract class PartTimeEmployee extends Employee {

  protected Double contractualHours;
  protected Double actualWorkedHours;
  protected Double bonusOvertimeEarnings;

  private static final Double BASE_PRODUCTIVITY_MULTIPLIER = 3.7;
  private static final Double INTERMEDIATE_BONUS = 1.4;

  /**
   * Constructor for the class PartTimeEmployee.
   *
   * @param employeeId            - String, representing part-time employee's ID
   * @param contactInfo           - ContactInfo, representing part-time employee's contact
   *                              information
   * @param employmentDate        - LocalDate, representing the date the part-time employee was
   *                              employed
   * @param employmentLevel       - EmploymentLevel, representing the part-time employee's standing
   *                              in the company
   * @param lastYearEarnings      - Double, representing the part-time employee's earnings from the
   *                              past year
   * @param contractualHours      - Double, representing the part-time employee's contractual hours
   * @param actualWorkedHours     - Double, representing the part-time employee's actual worked
   *                              hours
   * @param bonusOvertimeEarnings - Double, representing the part-time employee's bonus overtime
   *                              earnings
   **/

  public PartTimeEmployee(String employeeId, ContactInfo contactInfo, LocalDate employmentDate,
      EmploymentLevel employmentLevel, double lastYearEarnings, double contractualHours,
      double actualWorkedHours, double bonusOvertimeEarnings) {
    super(employeeId, contactInfo, employmentDate, employmentLevel, lastYearEarnings);
    this.contractualHours = contractualHours;
    this.actualWorkedHours = actualWorkedHours;
    this.bonusOvertimeEarnings = bonusOvertimeEarnings;
  }

  /**
   * @return - Double, giving part-time employee's contractual hours
   */
  public Double getContractualHours() {
    return contractualHours;
  }

  /**
   * @return - Double, giving part-time employee's actual worked hours
   */
  public Double getActualWorkedHours() {
    return actualWorkedHours;
  }

  /**
   * @return - Double, giving part-time employee's bonus overtime earnings
   */
  public Double getBonusOvertimeEarnings() {
    return bonusOvertimeEarnings;
  }

  @Override
  public Double estimateProductivity() {
    double productivity = (actualWorkedHours / contractualHours) * BASE_PRODUCTIVITY_MULTIPLIER;
    if (employmentLevel == EmploymentLevel.INTERMEDIATE_LEVEL) {
      productivity += INTERMEDIATE_BONUS;
    }
    return productivity;
  }
}
