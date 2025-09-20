package problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class Catalog stores information about a catalog
 */

public class Catalog {

  private List<Item> items;

  /**
   * Constructor for the class Book.
   **/
  public Catalog() {
    this.items = new ArrayList<>();
  }

  /**
   * Constructor for the class Book.
   *
   * @param items - List<Item>, representing the items in the catalog
   **/
  public Catalog(List<Item> items) {
    this.items = new ArrayList<>(items);
  }

  /**
   * adds an item to the catalog
   *
   * @param item - Item, representing an item to be added
   */
  public void addItem(Item item) {
    items.add(item);
  }

  /**
   * removes an item from the catalog
   *
   * @param item - Item, representing the item to be removed
   */
  public void removeItem(Item item) {
    items.remove(item);
  }

  /**
   * @param keyword, representing the keyword searching for
   * @return - List<Item>, giving a list of items containing keyword
   */
  public List<Item> search(String keyword) {
    List<Item> result = new ArrayList<>();
    String key = keyword.toLowerCase();
    for (Item item : items) {
      if (item.getTitle().toLowerCase().contains(key)) {
        result.add(item);
      }
    }
    return result;
  }

  /**
   * @param author, representing the author keyword searching for
   * @return - List<Item>, giving a list of items containing keyword
   */
  public List<Item> search(Author author) {
    List<Item> result = new ArrayList<>();
    for (Item item : items) {
      if (item instanceof Book && ((Book) item).getCreator().equals(author)) {
        result.add(item);
      }
    }
    return result;
  }

  /**
   * @param artist, representing the artist keyword searching for
   * @return - List<Item>, giving a list of items containing keyword
   */
  public List<Item> search(RecordingArtist artist) {
    List<Item> results = new ArrayList<>();
    for (Item item : items) {
      if (item instanceof Music) {
        Music music = (Music) item;
        Creator creator = music.getCreator();
        if (creator instanceof RecordingArtist) {
          if (creator.equals(artist)) {
            results.add(music);
          }
        } else if (creator instanceof Band) {
          Band band = (Band) creator;
          if (band.getMembers().contains(artist)) {
            results.add(music);
          }
        }
      }
    }
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(items, catalog.items);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(items);
  }

  @Override
  public String toString() {
    return "Catalog{" +
        "items=" + items +
        '}';
  }
}
