package HW3;

/**
 * Class Property stores information about a property
 */
public abstract class Property {

  protected String address;
  protected Integer size;

  /**
   * Constructor for the class Property
   *
   * @param address - String, the address
   * @param size    - Integer, the size
   */
  public Property(String address, Integer size) {
    if (size < 0) {
      throw new IllegalArgumentException("Size cannot be negative.");
    }
    this.address = address;
    this.size = size;
  }

  /**
   * @return - String, giving the address of the property
   */
  public String getAddress() {
    return address;
  }

  /**
   * @return - Integer, giving the size of the property
   */
  public Integer getSize() {
    return size;
  }
}
