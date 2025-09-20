package HW3;

/**
 * Class Listing stores information about a listing
 */
public class Listing<T extends Property, U extends Contract> {

  private final T property;
  private final U contract;

  /**
   * Constructor for the class Listing
   *
   * @param property - T, the property
   * @param contract - U, the contract
   */
  public Listing(T property, U contract) {
    this.property = property;
    this.contract = contract;
  }

  /**
   * @return T, giving the property
   */
  public T getProperty() {
    return property;
  }

  /**
   * @return U, giving the contract
   */
  public U getContract() {
    return contract;
  }
}
