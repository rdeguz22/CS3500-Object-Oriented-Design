package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShareButtonDecoratorTest {

  private SocialPost post;
  private ShareButtonDecorator decorator;

  @BeforeEach
  void setUp() {
    post = new SocialPost.PostBuilder()
        .setContent("Hello World")
        .setAuthor("Rico")
        .setType(PostType.TEXT)
        .addTag("#greeting")
        .build();
    decorator = new ShareButtonDecorator(post);
  }

  @Test
  void testGetEngagementScore() {
    assertEquals(20.0, decorator.getEngagementScore());
  }
}