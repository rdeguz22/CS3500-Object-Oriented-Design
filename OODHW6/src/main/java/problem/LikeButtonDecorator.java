package problem;

/**
 * Class LikeButtonDecorator stores information about the like button decorator
 */
public class LikeButtonDecorator extends PostDecorator {

  public final static int LIKE_ENGAGEMENT = 10;

  /**
   * Constructor for the class LikeButtonDecorator
   *
   * @param postComponent - PostComponent, the post component
   */
  public LikeButtonDecorator(PostComponent postComponent) {
    super(postComponent);
  }

  @Override
  public double getEngagementScore() {
    return super.getEngagementScore() + LIKE_ENGAGEMENT;
  }
}
