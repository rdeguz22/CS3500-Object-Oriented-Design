package HW3;

/**
 * Class Contract stores information about a contract
 */
public abstract class Contract {

  protected Double askingPrice;
  protected Boolean negotiable;

  /**
   * Constructor for the class Contract
   *
   * @param askingPrice - Double, the asking price
   * @param negotiable  - Boolean, the flag to determine whether the price is negotiable
   */
  public Contract(Double askingPrice, Boolean negotiable) {
    this.askingPrice = askingPrice;
    this.negotiable = negotiable;
  }

  /**
   * @return - Double, giving the asking price
   */
  public Double getAskingPrice() {
    return askingPrice;
  }

  /**
   * @return - Boolean, giving the flag to determine whether the price is negotiable
   */
  public Boolean getNegotiable() {
    return negotiable;
  }

  /**
   * @return - Double, giving the commission
   */
  public abstract Double getCommission();
}
