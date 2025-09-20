package problem;

/**
 * Class PublicStrategy stores information about a public strategy
 */
public class PublicStrategy implements Strategy {

  /**
   * Constructor for the class PublicStrategy
   */
  public PublicStrategy() {
  }

  @Override
  public void adoptStrategy() {
    System.out.println("Using Public Strategy: Post visible to everyone.");
  }
}
