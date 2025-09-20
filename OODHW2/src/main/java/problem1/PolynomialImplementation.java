package problem1;

import java.util.Objects;

/**
 * Class PolynomialImplementation stores information about a polynomial
 */

public class PolynomialImplementation implements Polynomial {

  private Term head;

  @Override
  public int getDegree() {
    int maxPower = 0;
    Term current = head;
    while (current != null) {
      if (current.power > maxPower) {
        maxPower = current.power;
      }
      current = current.next;
    }
    return maxPower;
  }

  @Override
  public int getCoefficient(int power) {
    Term current = head;
    while (current != null) {
      if (current.power == power) {
        return current.coefficient;
      }
      current = current.next;
    }
    return 0;
  }

  @Override
  public void addTerm(int coefficient, int power) {
    if (power < 0) {
      throw new IllegalArgumentException("Power must be non-negative");
    }
    if (coefficient == 0) {
      return;
    }
    if (head == null) {
      head = new Term(coefficient, power);
      return;
    }
    Term current = head;
    Term prev = null;
    while (current != null && current.power > power) {
      prev = current;
      current = current.next;
    }
    if (current != null && current.power == power) {
      current.coefficient += coefficient;
      if (current.coefficient == 0) {
        if (prev == null) {
          head = head.next;
        } else {
          prev.next = current.next;
        }
      }
    } else {
      Term newTerm = new Term(coefficient, power);
      if (prev == null) {
        newTerm.next = head;
        head = newTerm;
      } else {
        newTerm.next = current;
        prev.next = newTerm;
      }
    }
  }

  @Override
  public Boolean compare(Polynomial polynomial) {
    if (!(polynomial instanceof PolynomialImplementation)) {
      return false;
    }
    PolynomialImplementation other = (PolynomialImplementation) polynomial;
    Term t1 = this.head;
    Term t2 = other.head;
    while (t1 != null && t2 != null) {
      if (!t1.equals(t2)) {
        return false;
      }
      t1 = t1.next;
      t2 = t2.next;
    }
    return t1 == null && t2 == null;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolynomialImplementation that = (PolynomialImplementation) o;
    return Objects.equals(head, that.head);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(head);
  }

  @Override
  public String toString() {
    return "PolynomialImplementation{" +
        "head=" + head +
        '}';
  }
}
