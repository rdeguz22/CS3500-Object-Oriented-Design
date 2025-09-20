package hw1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class Manager stores information about a manager.
 **/
public class Manager extends FullTimeEmployee {

  private Integer numberOfEmployeesManaged;

  private static final Double MANAGER_BONUS = 1.8;
  private static final Integer MANAGER_BONUS_THRESHOLD = 8;

  /**
   * Constructor for the class Manager.
   *
   * @param employeeId               - String, representing manger's ID
   * @param contactInfo              - ContactInfo, representing manager's contact information
   * @param employmentDate           - LocalDate, representing the date the manager was employed
   * @param employmentLevel          - EmploymentLevel, representing the manager's standing in the
   *                                 company
   * @param lastYearEarnings         - Double, representing the manager's earnings from the past
   *                                 year
   * @param basePay                  - Double, representing the manager's base pay
   * @param bonuses                  - Double, representing the manager's bonuses
   * @param overtime                 - Double, representing the manager's overtime
   * @param lastPromotionDate        - LocalDate, representing the manager's last promotion date
   * @param numberOfProjects         - Integer, representing the manager's number of projects
   * @param numberOfEmployeesManaged - Integer, representing the manager's number of employee's
   *                                 managed
   **/

  public Manager(String employeeId, ContactInfo contactInfo, LocalDate employmentDate,
      EmploymentLevel employmentLevel, double lastYearEarnings, double basePay, double bonuses,
      double overtime, LocalDate lastPromotionDate, int numberOfProjects,
      int numberOfEmployeesManaged) {
    super(employeeId, contactInfo, employmentDate, employmentLevel, lastYearEarnings, basePay,
        bonuses, overtime, lastPromotionDate, numberOfProjects);
    this.numberOfEmployeesManaged = numberOfEmployeesManaged;
  }


  /**
   * @return - Integer, giving the manager's number of employees managed
   */
  public Integer getNumberOfEmployeesManaged() {
    return numberOfEmployeesManaged;
  }

  @Override
  public Double estimateProductivity() {
    double productivity = super.estimateProductivity();
    if (numberOfEmployeesManaged > MANAGER_BONUS_THRESHOLD) {
      productivity += MANAGER_BONUS;
    }
    return productivity;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager manager = (Manager) o;
    return Objects.equals(numberOfEmployeesManaged, manager.numberOfEmployeesManaged);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(numberOfEmployeesManaged);
  }

  @Override
  public String toString() {
    return "Manager{" +
        "numberOfEmployeesManaged=" + numberOfEmployeesManaged +
        ", basePay=" + basePay +
        ", bonuses=" + bonuses +
        ", overtime=" + overtime +
        ", lastPromotionDate=" + lastPromotionDate +
        ", numberOfProjects=" + numberOfProjects +
        ", employeeID='" + employeeID + '\'' +
        ", contactInfo=" + contactInfo +
        ", employmentDate=" + employmentDate +
        ", employmentLevel=" + employmentLevel +
        ", lastYearsEarnings=" + lastYearsEarnings +
        '}';
  }
}