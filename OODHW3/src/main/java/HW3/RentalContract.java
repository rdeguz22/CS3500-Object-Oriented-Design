package HW3;

/**
 * Class Contract stores information about a contract
 */
public class RentalContract extends Contract {

  private Integer termMonths;

  /**
   * Constructor for the class SaleContract
   *
   * @param askingPrice - Double, the asking price
   * @param negotiable  - Boolean, the flag to determine whether the price is negotiable
   * @param termMonths  - Integer, the term in months of the rental contract
   */
  public RentalContract(Double askingPrice, Boolean negotiable, Integer termMonths) {
    super(askingPrice, negotiable);
    if (termMonths < 0) {
      throw new IllegalArgumentException("The term cannot be negative");
    }
    this.termMonths = termMonths;
  }

  /**
   * @return - Integer, giving the term in months of the rental contract
   */
  public Integer getTermMonths() {
    return termMonths;
  }

  @Override
  public Double getCommission() {
    return askingPrice * termMonths;
  }
}
