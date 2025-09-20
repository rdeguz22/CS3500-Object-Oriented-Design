package problem;

/**
 * Class FriendsOnlyStrategy stores information about the friends only strategy
 */
public class FriendsOnlyStrategy implements Strategy {

  /**
   * Constructor for the class FriendsOnlyStrategy
   */
  public FriendsOnlyStrategy() {
  }

  @Override
  public void adoptStrategy() {
    System.out.println("Using Friends Only Strategy: Post visible to friends.");
  }
}
