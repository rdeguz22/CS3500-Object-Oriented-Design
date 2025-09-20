package problem3;

import java.util.Objects;

/**
 * Class Person stores information about a person
 */

public abstract class Person implements Creator {

  protected String firstName;
  protected String lastName;

  /**
   * Constructor for the class Person.
   *
   * @param firstName - String, representing person's first name
   * @param lastName  - String, representing person's last name
   **/
  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return - String, giving person's first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return - String, giving person's last name
   */
  public String getLastName() {
    return lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(firstName, person.firstName) && Objects.equals(lastName,
        person.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
