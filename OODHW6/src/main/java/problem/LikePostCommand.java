package problem;

/**
 * Class LikePostCommand stores information about a like command
 */
public class LikePostCommand implements Command {

  private SocialPost post;

  /**
   * Constructor for the class LikePostCommand
   *
   * @param post - SocialPost, the post
   */
  public LikePostCommand(SocialPost post) {
    this.post = post;
  }

  @Override
  public void execute() {
    post.like();
  }
}
