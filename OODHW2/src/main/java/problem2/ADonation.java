package problem2;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Class ADonation stores information about a donation
 */

public abstract class ADonation implements Donation {

  protected Double amount;
  protected LocalDateTime creationDate;

  /**
   * Constructor for the class Donation.
   *
   * @param amount       - Double, representing a donation amount
   * @param creationDate - LocalDateTime, representing the creation date of a donation
   **/
  public ADonation(Double amount, LocalDateTime creationDate) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount must be positive.");
    }
    this.amount = amount;
    this.creationDate = creationDate;
  }

  @Override
  public Double getAmount() {
    return amount;
  }

  @Override
  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ADonation aDonation = (ADonation) o;
    return Objects.equals(amount, aDonation.amount) && Objects.equals(
        creationDate, aDonation.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, creationDate);
  }

  @Override
  public String toString() {
    return "ADonation{" +
        "amount=" + amount +
        ", creationDate=" + creationDate +
        '}';
  }
}
