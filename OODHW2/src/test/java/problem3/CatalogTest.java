package problem3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatalogTest {

  private Catalog catalog;
  private Author author;
  private RecordingArtist artist;
  private Band band;
  private Book book;
  private Music soloMusic;
  private Music bandMusic;

  @BeforeEach
  void setUp() {
    catalog = new Catalog();
    author = new Author("James", "Clear");
    book = new Book(author, "Atomic Habits", 2018);
    artist = new RecordingArtist("Kurt", "Cobain");
    band = new Band("Nirvana", List.of(artist));
    soloMusic = new Music(artist, "Come As You Are", 1992);
    bandMusic = new Music(band, "Smells Like Teen Spirit", 1991);
    catalog.addItem(book);
    catalog.addItem(soloMusic);
    catalog.addItem(bandMusic);
  }

  @Test
  void testAddAndRemoveItem() {
    Book newBook = new Book(new Author("George", "Orwell"), "1984", 1949);
    catalog.addItem(newBook);
    assertTrue(catalog.search("1984").contains(newBook));
    catalog.removeItem(newBook);
    assertFalse(catalog.search("1984").contains(newBook));
  }

  @Test
  void testSearchByKeyword() {
    List<Item> results = catalog.search("habit");
    assertEquals(1, results.size());
    assertTrue(results.contains(book));
  }

  @Test
  void testSearchByAuthor() {
    List<Item> results = catalog.search(author);
    assertEquals(1, results.size());
    assertTrue(results.contains(book));
  }

  @Test
  void testSearchByArtist() {
    List<Item> results = catalog.search(artist);
    assertEquals(2, results.size());
    assertTrue(results.contains(soloMusic));
    assertTrue(results.contains(bandMusic));
  }
}