package problem;

/**
 * Class CommentSectionDecorator stores information about the comment section decorator
 */
public class CommentSectionDecorator extends PostDecorator {

  public static final int COMMENT_ENGAGEMENT = 20;

  /**
   * Constructor for the class CommentSectionDecorator
   *
   * @param postComponent - PostComponent, the post component
   */
  public CommentSectionDecorator(PostComponent postComponent) {
    super(postComponent);
  }

  @Override
  public double getEngagementScore() {
    return super.getEngagementScore() + COMMENT_ENGAGEMENT;
  }
}
