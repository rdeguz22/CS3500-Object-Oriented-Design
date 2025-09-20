package problem2;

import java.time.LocalDateTime;

/**
 * Class Pledge stores information about a pledge
 */

public class Pledge extends ADonation {

  private LocalDateTime processingDate;

  /**
   * Constructor for the class Pledge.
   *
   * @param amount       - Double, representing a pledge amount
   * @param creationDate - LocalDateTime, representing the creation date of a pledge
   **/
  public Pledge(Double amount, LocalDateTime creationDate) {
    super(amount, creationDate);
    this.processingDate = null;
  }

  /**
   * Overloaded constructor that allows setting a processing date at creation.
   *
   * @param amount         - Double, representing a pledge amount
   * @param creationDate   - LocalDateTime, representing the creation date of a pledge
   * @param processingDate - LocalDateTime, representing the processing date of a pledge
   */
  public Pledge(Double amount, LocalDateTime creationDate, LocalDateTime processingDate) {
    super(amount, creationDate);
    setProcessingDate(processingDate);
  }

  /**
   * @param processingDate - LocalDateTime, representing the processing date of the pledge sets a
   *                       processing date of the pledge
   */
  public void setProcessingDate(LocalDateTime processingDate) {
    if (processingDate.isBefore(creationDate)) {
      throw new IllegalArgumentException("Processing date must not be before creation date.");
    }
    this.processingDate = processingDate;
  }

  /**
   * removes the processing date of the pledge
   */
  public void removeProcessingDate() {
    this.processingDate = null;
  }

  /**
   * @return - LocalDateTime, giving the processing date
   */
  public LocalDateTime getProcessingDate() {
    return processingDate;
  }

  @Override
  public Double getAmountForYear(int year) {
    return (processingDate != null && processingDate.getYear() == year) ? amount : 0.0;
  }
}
