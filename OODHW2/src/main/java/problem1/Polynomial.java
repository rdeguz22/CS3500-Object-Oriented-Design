package problem1;

/**
 * Interface Polynomial stores information about a polynomial
 */

public interface Polynomial {

  /**
   * @return - Integer, giving the degree of the polynomial
   */
  int getDegree();

  /**
   * @param power - int, representing the power of a term
   * @return - int, giving the coefficient of a term
   */
  int getCoefficient(int power);

  /**
   * @param coefficient - int, representing the coefficient wanted to be added
   * @param power       - int, representing the power wanted to be added adds a term given the
   *                    coefficient and power to the polynomial
   */
  void addTerm(int coefficient, int power);

  /**
   * @param polynomial - Polynomial, representing the polynomial being compared to
   * @return - Boolean, comparing two polynomials
   */
  Boolean compare(Polynomial polynomial);
}
