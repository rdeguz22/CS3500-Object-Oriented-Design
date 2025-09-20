package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FollowerNotifierTest {

  private SocialPost post;
  private FollowerNotifier notifier;

  @BeforeEach
  void setUp() {
    post = new SocialPost.PostBuilder()
        .setContent("Hello World")
        .setAuthor("Rico")
        .setType(PostType.TEXT)
        .addTag("#greeting")
        .build();
    notifier = new FollowerNotifier(post);
    post.addObserver(notifier);
  }

  @Test
  void testUpdatePublished() {
    notifier.setEvent(Event.PUBLISHED);
    assertDoesNotThrow(() -> notifier.update());
  }

  @Test
  void testUpdateLiked() {
    notifier.setEvent(Event.LIKED);
    assertDoesNotThrow(() -> notifier.update());
  }

  @Test
  void testUpdateShared() {
    notifier.setEvent(Event.SHARED);
    assertDoesNotThrow(() -> notifier.update());
  }
}