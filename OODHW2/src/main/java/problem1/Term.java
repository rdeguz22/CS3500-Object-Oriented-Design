package problem1;

import java.util.Objects;

/**
 * Class term stores information about a term
 */

public class Term {

  public int coefficient;
  public int power;
  public Term next;

  /**
   * Constructor for the class Term
   *
   * @param coefficient - int, representing the coefficient of a term
   * @param power       - int, representing the power of a term
   */
  public Term(int coefficient, int power) {
    this.coefficient = coefficient;
    this.power = power;
    this.next = null;
  }

  /**
   * @return - int, giving the coefficient of the term
   */
  public int getCoefficient() {
    return coefficient;
  }

  /**
   * @return - int, giving the power of the term
   */
  public int getPower() {
    return power;
  }

  /**
   * @return - Term, giving the next term
   */
  public Term getNext() {
    return next;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Term term = (Term) o;
    return coefficient == term.coefficient && power == term.power && Objects.equals(next,
        term.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coefficient, power, next);
  }

  @Override
  public String toString() {
    return "Term{" +
        "coefficient=" + coefficient +
        ", power=" + power +
        ", next=" + next +
        '}';
  }
}
