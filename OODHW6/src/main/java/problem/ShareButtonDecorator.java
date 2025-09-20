package problem;

/**
 * Class ShareButtonDecorator stores information about the share button decorator
 */
public class ShareButtonDecorator extends PostDecorator {

  public static final int SHARE_ENGAGEMENT = 15;

  /**
   * Constructor for the class ShareButtonDecorator
   *
   * @param postComponent - PostComponent, the post component
   */
  public ShareButtonDecorator(PostComponent postComponent) {
    super(postComponent);
  }

  @Override
  public double getEngagementScore() {
    return super.getEngagementScore() + SHARE_ENGAGEMENT;
  }
}
