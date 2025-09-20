package problem;

/**
 * Class PrivateStrategy stores information about a private strategy
 */
public class PrivateStrategy implements Strategy {

  /**
   * Constructor for the class PrivateStrategy
   */
  public PrivateStrategy() {
  }

  @Override
  public void adoptStrategy() {
    System.out.println("“Using Private Strategy: post visible to author only.");
  }
}
