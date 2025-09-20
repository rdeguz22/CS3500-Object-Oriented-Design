package HW3;

/**
 * Class ResidentialProperty stores information about a residential property
 */
public class ResidentialProperty extends Property {

  private Integer numBedrooms;
  private Double numBathrooms;

  /**
   * Constructor for the class ResidentialProperty
   *
   * @param address      - String, the address
   * @param size         - Integer, the size
   * @param numBedrooms  - Integer, the number of bedrooms
   * @param numBathrooms - Double, the number of bathrooms
   */
  public ResidentialProperty(String address, Integer size, Integer numBedrooms,
      Double numBathrooms) {
    super(address, size);
    if (numBedrooms < 0) {
      throw new IllegalArgumentException("Number of Bedrooms cannot be negative.");
    }
    if (numBathrooms < 0) {
      throw new IllegalArgumentException("Number of Bathrooms cannot be negative.");
    }
    this.numBedrooms = numBedrooms;
    this.numBathrooms = numBathrooms;
  }

  /**
   * @return - Integer, giving the number of bedrooms in the residential property
   */
  public Integer getNumBedrooms() {
    return numBedrooms;
  }

  /**
   * @return - Double, giving the number of bathrooms in the residential property
   */
  public Double getNumBathrooms() {
    return numBathrooms;
  }
}
