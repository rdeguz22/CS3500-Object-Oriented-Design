package HW3;

/**
 * Class SaleContract stores information about a sale contract
 */
public class SaleContract extends Contract {

  /**
   * Constructor for the class SaleContract
   *
   * @param askingPrice - Double, the asking price
   * @param negotiable  - Boolean, the flag to determine whether the price is negotiable
   */
  public SaleContract(Double askingPrice, Boolean negotiable) {
    super(askingPrice, negotiable);
  }

  @Override
  public Double getCommission() {
    return askingPrice;
  }
}
