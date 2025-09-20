package problem2;

import java.time.LocalDateTime;

/**
 * Interface Donation stores information about a donation
 */

public interface Donation {

  /**
   * @return - Double, giving the donation amount
   */
  Double getAmount();

  /**
   * @return - LocalDateTime, giving the creation date of the donation
   */
  LocalDateTime getCreationDate();

  /**
   * @param year - String, representing the year that you are getting the amount from
   * @return - Double, giving the amount donated in the year
   */
  Double getAmountForYear(int year);
}
