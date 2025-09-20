package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthorTest {

  private Author author;

  @BeforeEach
  void setUp() {
    author = new Author("Dav", "Pilkey");
  }

  @Test
  void testGetFirstName() {
    assertEquals("Dav", author.getFirstName());
  }

  @Test
  void testGetLastName() {
    assertEquals("Pilkey", author.getLastName());
  }
}