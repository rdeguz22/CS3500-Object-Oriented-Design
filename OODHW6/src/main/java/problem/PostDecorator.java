package problem;

/**
 * Abstract class PostDecorator stores information about the post decorator
 */
public abstract class PostDecorator implements PostComponent {

  protected final PostComponent postComponent;

  /**
   * Constructor for the class PostDecorator
   *
   * @param postComponent - PostComponent, the post component
   */
  public PostDecorator(PostComponent postComponent) {
    this.postComponent = postComponent;
  }

  @Override
  public double getEngagementScore() {
    return postComponent.getEngagementScore();
  }
}
