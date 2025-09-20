package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommentSectionDecoratorTest {

  private SocialPost post;
  private CommentSectionDecorator decorator;

  @BeforeEach
  void setUp() {
    post = new SocialPost.PostBuilder()
        .setContent("Hello World")
        .setAuthor("Rico")
        .setType(PostType.TEXT)
        .addTag("#greeting")
        .build();
    decorator = new CommentSectionDecorator(post);
  }

  @Test
  void testGetEngagementScore() {
    assertEquals(25.0, decorator.getEngagementScore());
  }
}