package problem3;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Class Band stores information about a band
 */

public class Band implements Creator {

  private final String name;
  private final List<RecordingArtist> members;

  /**
   * Constructor for the class Band.
   *
   * @param name    - String, representing band's name
   * @param members - List, representing the band's members
   **/

  public Band(String name, List<RecordingArtist> members) {
    this.name = name;
    this.members = new ArrayList<>(members);
  }

  /**
   * @return - String, giving band's name
   */
  public String getName() {
    return name;
  }

  /**
   * @return - List, giving band's members
   */
  public List<RecordingArtist> getMembers() {
    return members;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Band band = (Band) o;
    return Objects.equals(name, band.name) && Objects.equals(members,
        band.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, members);
  }
}
