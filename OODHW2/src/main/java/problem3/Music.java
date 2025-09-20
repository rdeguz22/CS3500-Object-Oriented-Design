package problem3;

/**
 * Class Music stores information about music
 */

public class Music extends Item {

  /**
   * Constructor for the class Book.
   *
   * @param creator - Creator, representing the creator of the music
   * @param title   - String, representing the title of the music
   * @param year    - int, representing the year that the music was made
   **/
  public Music(Creator creator, String title, int year) {
    super(creator, title, year);
    if (!(creator instanceof RecordingArtist) && !(creator instanceof Band)) {
      throw new IllegalArgumentException("Music creator must be a RecordingArtist or Band.");
    }
  }
}
