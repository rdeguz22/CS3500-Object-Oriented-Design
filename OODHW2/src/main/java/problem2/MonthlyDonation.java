package problem2;

import java.time.LocalDateTime;

/**
 * Class MonthlyDonation stores information about a monthly donation
 */

public class MonthlyDonation extends ADonation {

  private LocalDateTime cancellationDate;

  /**
   * Constructor for the class Donation.
   *
   * @param amount       - Double, representing a donation amount
   * @param creationDate - LocalDateTime, representing the creation date of a donation
   **/
  public MonthlyDonation(Double amount, LocalDateTime creationDate) {
    super(amount, creationDate);
    this.cancellationDate = null;
  }

  /**
   * gives the monthly donation a cancel date
   */
  public void cancel(LocalDateTime cancellationDate) {
    if (cancellationDate.isBefore(creationDate)) {
      throw new IllegalArgumentException("Cancellation date cannot be before creation date.");
    }
    this.cancellationDate = cancellationDate;
  }

  /**
   * @return - LocalDateTime, giving the cancellation date
   */
  public LocalDateTime getCancellationDate() {
    return cancellationDate;
  }

  @Override
  public Double getAmountForYear(int year) {
    int startYear = creationDate.getYear();
    int startMonth = creationDate.getMonthValue();
    int endYear = (cancellationDate != null) ? cancellationDate.getYear() : year;
    int endMonth = (cancellationDate != null) ? cancellationDate.getMonthValue() : 12;
    if (year < startYear || year > endYear) {
      return 0.0;
    }
    int fromMonth = (year == startYear) ? startMonth : 1;
    int toMonth = (year == endYear) ? endMonth : 12;
    return amount * (toMonth - fromMonth + 1);
  }
}
