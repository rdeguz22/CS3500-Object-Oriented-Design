package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Class SocialPost stores information about a social post
 */
public class SocialPost implements Cloneable, PostComponent, PostObservable {

  private final String content;
  private final String author;
  private final PostType type;
  private final List<String> tags;
  private double engagementScore;
  private List<PostObserver> observers;

  /**
   * Private Constructor for the class SocialPost
   *
   * @param builder - PostBuilder, the builder
   */
  private SocialPost(PostBuilder builder) {
    this.content = builder.content;
    this.author = builder.author;
    this.type = builder.type;
    this.tags = builder.tags;
    this.engagementScore = builder.engagementScore;
    this.observers = new ArrayList<>();
  }

  /**
   * Gets content.
   *
   * @return - String, the content
   */
  public String getContent() {
    return content;
  }

  /**
   * Gets author.
   *
   * @return - String, the author
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Gets type.
   *
   * @return - PostType, the type
   */
  public PostType getType() {
    return type;
  }

  /**
   * Gets tags.
   *
   * @return - List<String>, the tags
   */
  public List<String> getTags() {
    return tags;
  }

  @Override
  public double getEngagementScore() {
    return engagementScore;
  }

  /**
   * Gets observers.
   *
   * @return - List<PostObserver>, the observers
   */
  public List<PostObserver> getObservers() {
    return observers;
  }

  @Override
  public SocialPost clone() {
    return new SocialPost.PostBuilder()
        .setContent(this.content)
        .setAuthor(this.author)
        .setType(this.type)
        .setEngagementScore(this.engagementScore)
        .setTags(this.tags)
        .build();
  }

  @Override
  public void addObserver(PostObserver postObserver) {
    if (!observers.contains(postObserver)) {
      observers.add(postObserver);
    }
  }

  @Override
  public void removeObserver(PostObserver postObserver) {
    if (!observers.remove(postObserver)) {
      throw new IllegalArgumentException("Observer not found.");
    }
  }

  @Override
  public void notifyObservers() {
    for (PostObserver observer : observers) {
      observer.update();
    }
  }

  /**
   * Publishes.
   */
  public void publish() {
    for (PostObserver observer : observers) {
      if (observer instanceof FollowerNotifier) {
        ((FollowerNotifier) observer).setEvent(Event.PUBLISHED);
      }
      if (observer instanceof AnalyticsTracker) {
        ((AnalyticsTracker) observer).setEvent(Event.PUBLISHED);
      }
    }
    notifyObservers();
  }

  /**
   * Likes.
   */
  public void like() {
    for (PostObserver observer : observers) {
      if (observer instanceof FollowerNotifier) {
        ((FollowerNotifier) observer).setEvent(Event.LIKED);
      }
      if (observer instanceof AnalyticsTracker) {
        ((AnalyticsTracker) observer).setEvent(Event.LIKED);
      }
    }
    notifyObservers();
  }

  /**
   * Shares.
   */
  public void share() {
    for (PostObserver observer : observers) {
      if (observer instanceof FollowerNotifier) {
        ((FollowerNotifier) observer).setEvent(Event.SHARED);
      }
      if (observer instanceof AnalyticsTracker) {
        ((AnalyticsTracker) observer).setEvent(Event.SHARED);
      }
    }
    notifyObservers();
  }

  /**
   * Static class PostBuilder stores information about the post builder
   */
  public static class PostBuilder {

    private String content;
    private String author;
    private PostType type;
    private List<String> tags = new ArrayList<>();
    private double engagementScore = 5.0;

    /**
     * Constructor for the class PostBuilder
     */
    public PostBuilder() {
    }

    /**
     * Sets content.
     *
     * @param content - String, the content
     * @return - PostBuilder, the content
     */
    public PostBuilder setContent(String content) {
      this.content = content;
      return this;
    }

    /**
     * Sets author.
     *
     * @param author - String, the author
     * @return - PostBuilder, the author
     */
    public PostBuilder setAuthor(String author) {
      this.author = author;
      return this;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return the type
     */
    public PostBuilder setType(PostType type) {
      this.type = type;
      return this;
    }

    /**
     * Add tag post builder.
     *
     * @param tag - String, the tag
     * @return - PostBuilder, the post builder
     */
    public PostBuilder addTag(String tag) {
      this.tags.add(tag);
      return this;
    }

    /**
     * Sets tags.
     *
     * @param tags - List<String>, the tags
     * @return - PostBuilder, the tags
     */
    public PostBuilder setTags(List<String> tags) {
      this.tags = new ArrayList<>(tags);
      return this;
    }

    /**
     * Sets engagement score.
     *
     * @param engagementScore - double, the engagement score
     * @return - PostBuilder, the engagement score
     */
    public PostBuilder setEngagementScore(double engagementScore) {
      this.engagementScore = engagementScore;
      return this;
    }

    /**
     * Builds the social post.
     *
     * @return - SocialPost, the social post
     */
    public SocialPost build() {
      return new SocialPost(this);
    }
  }

}
