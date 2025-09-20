package HW3;

/**
 * Class CommercialProperty stores information about a commercial residential property
 */
public class CommercialProperty extends Property {

  private Integer numOffices;
  private Boolean suitableForRetail;

  /**
   * Constructor for the class CommercialProperty
   *
   * @param address           - String, the address
   * @param size              - Integer, the size
   * @param numOffices        - Integer, the number of offices
   * @param suitableForRetail - Boolean, flag for if the commercial property is suitable for retail
   */
  public CommercialProperty(String address, Integer size, Integer numOffices,
      Boolean suitableForRetail) {
    super(address, size);
    this.numOffices = numOffices;
    this.suitableForRetail = suitableForRetail;
  }

  /**
   * @return - Integer, giving the number of offices in the commercial property
   */
  public Integer getNumOffices() {
    return numOffices;
  }

  /**
   * @return - Boolean, giving the flag for whether the commercial property is suitable for retail
   */
  public Boolean getSuitableForRetail() {
    return suitableForRetail;
  }
}
