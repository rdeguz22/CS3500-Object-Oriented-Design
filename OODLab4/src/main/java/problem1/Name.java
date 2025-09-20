package problem1;

public class Name {

  private String name;
  private String surname;

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public Name(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  @Override
  public String toString() {
    return "Name{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        '}';
  }
}
