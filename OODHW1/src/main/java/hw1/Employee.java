package hw1;

import java.time.LocalDate;

/**
 * Class Employee stores information about an employee.
 **/
public abstract class Employee {

  protected String employeeID;
  protected ContactInfo contactInfo;
  protected LocalDate employmentDate;
  protected EmploymentLevel employmentLevel;
  protected Double lastYearsEarnings;

  /**
   * Constructor for the class Employee.
   *
   * @param employeeID        - String, representing employee's ID
   * @param contactInfo       - ContactInfo, representing employee's contact information
   * @param employmentDate    - LocalDate, representing the date the employee was employed
   * @param employmentLevel   - EmploymentLevel, representing the employee's standing in the
   *                          company
   * @param lastYearsEarnings - Double, representing the employee's earnings from the past year
   **/
  public Employee(String employeeID, ContactInfo contactInfo, LocalDate employmentDate,
      EmploymentLevel employmentLevel, Double lastYearsEarnings) {
    this.employeeID = employeeID;
    this.contactInfo = contactInfo;
    this.employmentDate = employmentDate;
    this.employmentLevel = employmentLevel;
    this.lastYearsEarnings = lastYearsEarnings;
  }

  /**
   * @return - String, giving employee's ID
   */
  public String getEmployeeID() {
    return employeeID;
  }

  /**
   * @return - ContactInfo, giving employee's contact information
   */
  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  /**
   * @return - LocalDate, giving employee's date of employment
   */
  public LocalDate getEmploymentDate() {
    return employmentDate;
  }

  /**
   * @return - EmploymentLevel, giving employee's employment level
   */
  public EmploymentLevel getEmploymentLevel() {
    return employmentLevel;
  }

  /**
   * @return - Double, giving employee's earnings from the previous year
   */
  public Double getLastYearsEarnings() {
    return lastYearsEarnings;
  }

  /**
   * @return - Double, estimates the employee's productivity
   */
  public abstract Double estimateProductivity();
}
