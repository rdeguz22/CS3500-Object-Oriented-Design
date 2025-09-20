package problem1;

import java.util.Arrays;
import java.util.Objects;

public abstract class AVisualArtist extends AArtist {

  protected String[] exhibits;

  public AVisualArtist(Name name, Integer age, String[] genres, String[] awards,
      String[] exhibits) {
    super(name, age, genres, awards);
    this.exhibits = exhibits;
  }

  public String[] getExhibits() {
    return exhibits;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AVisualArtist that = (AVisualArtist) o;
    return Objects.deepEquals(exhibits, that.exhibits);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(exhibits);
  }
}
