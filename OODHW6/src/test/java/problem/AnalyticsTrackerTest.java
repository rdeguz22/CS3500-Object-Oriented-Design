package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnalyticsTrackerTest {

  private SocialPost post;
  private AnalyticsTracker tracker;

  @BeforeEach
  void setUp() {
    post = new SocialPost.PostBuilder()
        .setContent("Hello World")
        .setAuthor("Rico")
        .setType(PostType.TEXT)
        .addTag("#greeting")
        .build();
    PostComponent withLike = new LikeButtonDecorator(post);
    PostComponent withLikeShare = new ShareButtonDecorator(withLike);
    tracker = new AnalyticsTracker(withLikeShare);
    post.addObserver(tracker);
  }

  @Test
  void testUpdatePublished() {
    tracker.setEvent(Event.PUBLISHED);
    assertDoesNotThrow(() -> tracker.update());
  }

  @Test
  void testUpdateLiked() {
    tracker.setEvent(Event.LIKED);
    assertDoesNotThrow(() -> tracker.update());
  }

  @Test
  void testUpdateShared() {
    tracker.setEvent(Event.SHARED);
    assertDoesNotThrow(() -> tracker.update());
  }
}