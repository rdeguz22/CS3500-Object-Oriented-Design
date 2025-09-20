package problem1;

public class InvalidAgeException extends Exception {

  public InvalidAgeException(String message) {
    super(message);
  }

  public static void validateAge(int age) throws InvalidAgeException {
    if (age < 0 || age > 128) {
      throw new InvalidAgeException("Age must be a value within the range 0-128");
    }
  }
}
