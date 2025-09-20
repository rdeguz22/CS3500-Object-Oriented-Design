package problem;

/**
 * Class AnalyticsTracker stores information about the analytics tracker
 */
public class AnalyticsTracker implements PostObserver {

  private PostComponent component;
  private Event event;

  /**
   * Constructor for the class AnalyticsTracker
   *
   * @param component - PostComponent, the post component
   */
  public AnalyticsTracker(PostComponent component) {
    this.component = component;
  }

  /**
   * Sets an event
   */
  public void setEvent(Event event) {
    this.event = event;
  }

  @Override
  public void update() {
    if (event == Event.PUBLISHED) {
      System.out.println("- Analytics Tracker: Post engagement logged");
    } else if (event == Event.LIKED) {
      System.out.println(
          "- Analytics Tracker: Like count increased to " + (int) (
              component.getEngagementScore()
                  - LikeButtonDecorator.LIKE_ENGAGEMENT));
    } else if (event == Event.SHARED) {
      System.out.println(
          "- Analytics Tracker: Shared count increased to " + (int) (
              component.getEngagementScore()
                  - ShareButtonDecorator.SHARE_ENGAGEMENT));
    }
  }
}
