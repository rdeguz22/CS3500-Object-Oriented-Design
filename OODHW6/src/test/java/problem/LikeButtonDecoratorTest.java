package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LikeButtonDecoratorTest {

  private SocialPost post;
  private LikeButtonDecorator decorator;

  @BeforeEach
  void setUp() {
    post = new SocialPost.PostBuilder()
        .setContent("Hello World")
        .setAuthor("Rico")
        .setType(PostType.TEXT)
        .addTag("#greeting")
        .build();
    decorator = new LikeButtonDecorator(post);
  }

  @Test
  void testGetEngagementScore() {
    assertEquals(15.0, decorator.getEngagementScore());
  }
}