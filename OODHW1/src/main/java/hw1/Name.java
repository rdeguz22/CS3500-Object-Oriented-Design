package hw1;

import java.util.Objects;

/**
 * Name stores information about name. Name consists of two Strings: first name and last name.
 */
public class Name {

  private String firstName;
  private String lastName;

  /**
   * Constructor for class Name.
   *
   * @param firstName String, storing first name
   * @param lastName  String, storing last name
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return - String, first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return - String, last name.
   */
  public String getLastName() {
    return lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(firstName, name.firstName) && Objects.equals(lastName,
        name.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    return "Name{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
