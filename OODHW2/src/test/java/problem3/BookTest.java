package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

  private Book book;
  private Author author;

  @BeforeEach
  void setUp() {
    author = new Author("James", "Clear");
    book = new Book(author, "Atomic Habits", 2018);
  }

  @Test
  void testGetCreator() {
    assertEquals(author, book.getCreator());
  }

  @Test
  void testGetTitle() {
    assertEquals("Atomic Habits", book.getTitle());
  }

  @Test
  void testGetYear() {
    assertEquals(2018, book.getYear());
  }
}