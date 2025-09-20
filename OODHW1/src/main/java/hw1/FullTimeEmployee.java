package hw1;

import java.time.LocalDate;

/**
 * Class FullTimeEmployee stores information about a full-time employee.
 **/

public abstract class FullTimeEmployee extends Employee {

  protected Double basePay;
  protected Double bonuses;
  protected Double overtime;
  protected LocalDate lastPromotionDate;
  protected Integer numberOfProjects;

  private static final Double NUMBER_OF_PROJECTS_BONUS = 1.5;
  private static final Integer NUMBER_OF_PROJECTS_BONUS_THRESHOLD = 2;
  private static final Double INTERMEDIATE_BONUS = 1.4;
  private static final Double LAST_PROMOTION_PENALTY = 0.8;

  /**
   * Constructor for the class FullTimeEmployee.
   *
   * @param employeeId        - String, representing full-time employee's ID
   * @param contactInfo       - ContactInfo, representing full-time employee's contact information
   * @param employmentDate    - LocalDate, representing the date the full-time employee was
   *                          employed
   * @param employmentLevel   - EmploymentLevel, representing the full-time employee's standing in
   *                          the company
   * @param lastYearEarnings  - Double, representing the full-time employee's earnings from the past
   *                          year
   * @param basePay           - Double, representing the full-time employee's base pay
   * @param bonuses           - Double, representing the full-time employee's bonuses
   * @param overtime          - Double, representing the full-time employee's overtime
   * @param lastPromotionDate - LocalDate, representing the full-time employee's last promotion
   *                          date
   * @param numberOfProjects  - Integer, representing the full-time employee's number of projects
   **/

  public FullTimeEmployee(String employeeId, ContactInfo contactInfo, LocalDate employmentDate,
      EmploymentLevel employmentLevel, double lastYearEarnings, double basePay, double bonuses,
      double overtime, LocalDate lastPromotionDate, int numberOfProjects) {
    super(employeeId, contactInfo, employmentDate, employmentLevel, lastYearEarnings);
    this.basePay = basePay;
    this.bonuses = bonuses;
    this.overtime = overtime;
    this.lastPromotionDate = lastPromotionDate;
    this.numberOfProjects = numberOfProjects;
  }

  /**
   * @return - Double, giving full-time employee's base pay
   */
  public Double getBasePay() {
    return basePay;
  }

  /**
   * @return - Double, giving full-time employee's bonuses
   */
  public Double getBonuses() {
    return bonuses;
  }

  /**
   * @return - Double, giving full-time employee's overtime
   */
  public Double getOvertime() {
    return overtime;
  }

  /**
   * @return - LocalDate, giving full-time employee's last promotion date
   */
  public LocalDate getLastPromotionDate() {
    return lastPromotionDate;
  }

  /**
   * @return - Integer, giving full-time employee's number of projects
   */
  public Integer getNumberOfProjects() {
    return numberOfProjects;
  }

  @Override
  public Double estimateProductivity() {
    double productivity = super.lastYearsEarnings / basePay;
    if (numberOfProjects > NUMBER_OF_PROJECTS_BONUS_THRESHOLD) {
      productivity += NUMBER_OF_PROJECTS_BONUS;
    }
    if (employmentLevel == EmploymentLevel.INTERMEDIATE_LEVEL) {
      productivity += INTERMEDIATE_BONUS;
    }
    if (lastPromotionDate.isBefore(LocalDate.now().minusYears(3))) {
      productivity -= LAST_PROMOTION_PENALTY;
    }
    return productivity;
  }
}
