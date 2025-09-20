package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LikePostCommandTest {

  private SocialPost post;
  private Command command;

  @BeforeEach
  void setUp() {
    post = new SocialPost.PostBuilder()
        .setContent("Hello World")
        .setAuthor("Rico")
        .setType(PostType.TEXT)
        .addTag("#greeting")
        .build();
    command = new LikePostCommand(post);
  }

  @Test
  void execute() {
    assertDoesNotThrow(() -> command.execute());
  }
}