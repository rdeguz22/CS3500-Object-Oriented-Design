package hw1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class HourlyEmployee stores information about an hourly employee.
 **/

public class HourlyEmployee extends PartTimeEmployee {

  private Double hourlyRate;

  private static final Double HOURLY_RATE_BONUS_ = 3.0;
  private static final Double HOURLY_RATE_BONUS_THRESHOLD = 14.0;

  /**
   * Constructor for the class HourlyEmployee.
   *
   * @param employeeId            - String, representing hourly employee's ID
   * @param contactInfo           - ContactInfo, representing hourly employee's contact information
   * @param employmentDate        - LocalDate, representing the date the hourly employee was
   *                              employed
   * @param employmentLevel       - EmploymentLevel, representing the hourly employee's standing in
   *                              the company
   * @param lastYearEarnings      - Double, representing the hourly employee's earnings from the
   *                              past year
   * @param contractualHours      - Double, representing the hourly employee's contractual hours
   * @param actualWorkedHours     - Double, representing the hourly employee's actual worked hours
   * @param bonusOvertimeEarnings - Double, representing the hourly employee's bonus overtime
   *                              earnings
   * @param hourlyRate            - Double, representing the hourly employee's hourly rate
   **/

  public HourlyEmployee(String employeeId, ContactInfo contactInfo, LocalDate employmentDate,
      EmploymentLevel employmentLevel, Double lastYearEarnings, Double contractualHours,
      Double actualWorkedHours, Double bonusOvertimeEarnings, Double hourlyRate) {
    super(employeeId, contactInfo, employmentDate, employmentLevel, lastYearEarnings,
        contractualHours, actualWorkedHours, bonusOvertimeEarnings);
    this.hourlyRate = hourlyRate;
  }

  /**
   * @return - Double, giving hourly employee's hourly rate
   */
  public Double getHourlyRate() {
    return hourlyRate;
  }

  @Override
  public Double estimateProductivity() {
    double productivity = super.estimateProductivity();
    if (hourlyRate < HOURLY_RATE_BONUS_THRESHOLD) {
      productivity += HOURLY_RATE_BONUS_;
    }
    return productivity;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyEmployee that = (HourlyEmployee) o;
    return Objects.equals(hourlyRate, that.hourlyRate);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(hourlyRate);
  }

  @Override
  public String toString() {
    return "HourlyEmployee{" +
        "hourlyRate=" + hourlyRate +
        ", contractualHours=" + contractualHours +
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
