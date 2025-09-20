package hw1;

import java.time.LocalDate;

/**
 * Class BenefitsEligibleEmployee stores information about a benefits eligible employee.
 **/

public class BenefitsEligibleEmployee extends PartTimeEmployee {

  /**
   * Constructor for the class BenefitsEligibleEmployee.
   *
   * @param employeeId            - String, representing benefits-eligible employee's ID
   * @param contactInfo           - ContactInfo, representing benefits-eligible employee's contact
   *                              information
   * @param employmentDate        - LocalDate, representing the date the benefits-eligible employee
   *                              was employed
   * @param employmentLevel       - EmploymentLevel, representing the benefits-eligible employee's
   *                              standing in the company
   * @param lastYearEarnings      - Double, representing the benefits-eligible employee's earnings
   *                              from the past year
   * @param contractualHours      - Double, representing the benefits-eligible employee's
   *                              contractual hours
   * @param actualWorkedHours     - Double, representing the benefits-eligible employee's actual
   *                              worked hours
   * @param bonusOvertimeEarnings - Double, representing the benefits-eligible employee's bonus
   *                              overtime earnings
   **/

  public BenefitsEligibleEmployee(String employeeId, ContactInfo contactInfo,
      LocalDate employmentDate, EmploymentLevel employmentLevel, Double lastYearEarnings,
      Double contractualHours, Double actualWorkedHours, Double bonusOvertimeEarnings) {
    super(employeeId, contactInfo, employmentDate, employmentLevel, lastYearEarnings,
        contractualHours, actualWorkedHours, bonusOvertimeEarnings);
  }

  @Override
  public String toString() {
    return "BenefitsEligibleEmployee{" +
        "contractualHours=" + contractualHours +
        ", actualWorkedHours=" + actualWorkedHours +
        ", bonusOvertimeEarnings=" + bonusOvertimeEarnings +
        ", employeeID='" + employeeID + '\'' +
        ", contactInfo=" + contactInfo +
        ", employmentDate=" + employmentDate +
        ", employmentLevel=" + employmentLevel +
        ", lastYearsEarnings=" + lastYearsEarnings +
        '}';
  }
}
