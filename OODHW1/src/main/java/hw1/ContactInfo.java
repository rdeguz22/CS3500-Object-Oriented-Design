package hw1;

import java.util.Objects;

/**
 * ContactInfo provides contact information about a person
 */
public class ContactInfo {

  private Name name;
  private String address;
  private String phoneNumber;
  private String email;
  private Name emergencyContact;


  /**
   * Constructor for the class ContactInfo.
   *
   * @param name             - Name, representing person's name
   * @param address          - String, representing person's address
   * @param phoneNumber      - String, representing person's phone Number
   * @param email            - String, representing person's email
   * @param emergencyContact - Name, representing person's emergency contact
   **/
  public ContactInfo(Name name, String address, String phoneNumber, String email,
      Name emergencyContact) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.emergencyContact = emergencyContact;
  }

  /**
   * @return - Name, giving person's name
   */
  public Name getName() {
    return name;
  }

  /**
   * @return - String, giving person's address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @return - String, giving person's phone number
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @return - String, giving person's email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @return - Name, giving person's emergency contact
   */
  public Name getEmergencyContact() {
    return emergencyContact;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactInfo that = (ContactInfo) o;
    return Objects.equals(name, that.name) && Objects.equals(address,
        that.address) && Objects.equals(phoneNumber, that.phoneNumber)
        && Objects.equals(email, that.email) && Objects.equals(emergencyContact,
        that.emergencyContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, phoneNumber, email, emergencyContact);
  }

  @Override
  public String toString() {
    return "ContactInfo{" +
        "name=" + name +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", email='" + email + '\'' +
        ", emergencyContact=" + emergencyContact +
        '}';
  }
}
