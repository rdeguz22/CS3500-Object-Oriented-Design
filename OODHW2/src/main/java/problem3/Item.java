package problem3;

import java.util.Objects;

/**
 * Class Item stores information about an item
 */

public abstract class Item {

  protected Creator creator;
  protected String title;
  protected int year;

  /**
   * Constructor for the class Item.
   *
   * @param creator - Creator, representing the creator of the item
   * @param title   - String, representing the title of the item
   * @param year    - int, representing the year that the item was made
   **/
  public Item(Creator creator, String title, int year) {
    this.creator = creator;
    this.title = title;
    this.year = year;
  }

  /**
   * @return - Creator, giving creator of the item
   */
  public Creator getCreator() {
    return creator;
  }

  /**
   * @return - String, giving the title of the item
   */
  public String getTitle() {
    return title;
  }

  /**
   * @return - int, giving the year of the item
   **/
  public int getYear() {
    return year;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return year == item.year && Objects.equals(creator, item.creator)
        && Objects.equals(title, item.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, title, year);
  }

  @Override
  public String toString() {
    return "Item{" +
        "creator=" + creator +
        ", title='" + title + '\'' +
        ", year=" + year +
        '}';
  }
}
