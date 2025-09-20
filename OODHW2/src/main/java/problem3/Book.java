package problem3;

/**
 * Class Book stores information about a book
 */

public class Book extends Item {

  /**
   * Constructor for the class Book.
   *
   * @param creator - Creator, representing the creator of the item
   * @param title   - String, representing the title of the item
   * @param year    - int, representing the year that the item was made
   **/
  public Book(Creator creator, String title, int year) {
    super(creator, title, year);
  }

  @Override
  public Author getCreator() {
    return (Author) super.getCreator();
  }
}
