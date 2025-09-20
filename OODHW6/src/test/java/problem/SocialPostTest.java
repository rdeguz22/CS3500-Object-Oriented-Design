package problem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SocialPostTest {

  private SocialPost post;
  private SocialPost cloned;

  @BeforeEach
  void setUp() {
    post = new SocialPost.PostBuilder()
        .setContent("Hello World")
        .setAuthor("Rico")
        .setType(PostType.TEXT)
        .addTag("#greeting")
        .build();
    cloned = post.clone();
  }

  @Test
  void testGetContent() {
    assertEquals("Hello World", post.getContent());
    assertEquals("Hello World", cloned.getContent());
  }

  @Test
  void testGetAuthor() {
    assertEquals("Rico", post.getAuthor());
    assertEquals("Rico", cloned.getAuthor());
  }

  @Test
  void testGetType() {
    assertEquals(PostType.TEXT, post.getType());
    assertEquals(PostType.TEXT, cloned.getType());
  }

  @Test
  void testGetTags() {
    List<String> expectedTags = new ArrayList<>();
    expectedTags.add("#greeting");
    assertEquals(expectedTags, post.getTags());
    assertEquals(expectedTags, cloned.getTags());
  }

  @Test
  void testGetEngagementScore() {
    assertEquals(5.0, post.getEngagementScore());
    assertEquals(5.0, cloned.getEngagementScore());
  }

  @Test
  void testGetObservers() {
    assertEquals(0, post.getObservers().size());
    assertEquals(0, cloned.getObservers().size());
  }

  @Test
  void testAddAndRemoveObserver() {
    PostObserver observer = new FollowerNotifier(post);
    post.addObserver(observer);
    assertTrue(post.getObservers().contains(observer));
    post.removeObserver(observer);
    assertFalse(post.getObservers().contains(observer));
  }
}