package problem;

/**
 * Class SharePostCommand stores information about a share command
 */
public class SharePostCommand implements Command {

  private SocialPost post;

  /**
   * Constructor for the class SharePostCommand
   *
   * @param post - SocialPost, the post
   */
  public SharePostCommand(SocialPost post) {
    this.post = post;
  }

  @Override
  public void execute() {
    post.share();
  }
}
