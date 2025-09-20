package problem2;

import java.time.LocalDateTime;

/**
 * Class OneTimeDonation stores information about a one-time donation
 */

public class OneTimeDonation extends ADonation {

  /**
   * Constructor for the class OneTimeDonation.
   *
   * @param amount       - Double, representing a donation amount
   * @param creationDate - LocalDateTime, representing the creation date of a donation
   **/
  public OneTimeDonation(Double amount, LocalDateTime creationDate) {
    super(amount, creationDate);
  }

  @Override
  public Double getAmountForYear(int year) {
    return (creationDate.getYear() == year) ? amount : 0.0;
  }
}
