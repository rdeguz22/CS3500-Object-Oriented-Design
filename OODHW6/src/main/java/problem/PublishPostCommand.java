package problem;

/**
 * Class PublishPostCommand stores information about a publish command
 */
public class PublishPostCommand implements Command {

  private SocialPost post;

  /**
   * Constructor for the class PublishPostCommand
   *
   * @param post - SocialPost, the post
   */
  public PublishPostCommand(SocialPost post) {
    this.post = post;
  }

  @Override
  public void execute() {
    post.publish();
  }
}
