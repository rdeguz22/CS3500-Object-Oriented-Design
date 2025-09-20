package problem;

public class FollowerNotifier implements PostObserver {

  private SocialPost post;
  private Event event;

  /**
   * Constructor for the class FollowerNotifier
   *
   * @param post - SocialPost, the post
   */
  public FollowerNotifier(SocialPost post) {
    this.post = post;
  }

  /**
   * Sets an event
   */
  public void setEvent(Event event) {
    this.event = event;
  }

  @Override
  public void update() {
    int index = post.getObservers().indexOf(this);
    if (index == firstFollowerNotifierIndex(post)) {
      int count = 0;
      for (PostObserver observer : post.getObservers()) {
        if (observer instanceof FollowerNotifier) {
          count++;
        }
      }
      if (event == Event.PUBLISHED) {
        System.out.println(
            "- Follower Notifier: " + count + " followers notified.");
      } else if (event == Event.LIKED) {
        System.out.println("- Follower Notifier: Like notification sent to " + post.getAuthor());
      } else if (event == Event.SHARED) {
        System.out.println("- Follower Notifier: Share notification sent to " + post.getAuthor());
      }
    }
  }

  /**
   * Finds index of an observer that is a FollowerNotifier
   *
   * @param post - SocialPost, the post
   * @return - int, the index
   */
  private int firstFollowerNotifierIndex(SocialPost post) {
    for (int i = 0; i < post.getObservers().size(); i++) {
      if (post.getObservers().get(i) instanceof FollowerNotifier) {
        return i;
      }
    }
    return -1;
  }
}
