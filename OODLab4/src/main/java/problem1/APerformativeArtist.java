package problem1;

import java.util.Arrays;
import java.util.Objects;

public abstract class APerformativeArtist extends AArtist {

  protected String[] movies;
  protected String[] series;
  protected String[] otherMultimedia;

  public APerformativeArtist(Name name, Integer age, String[] genres, String[] awards,
      String[] movies, String[] series, String[] otherMultimedia) {
    super(name, age, genres, awards);
    this.movies = movies;
    this.series = series;
    this.otherMultimedia = otherMultimedia;
  }

  public String[] getMovies() {
    return movies;
  }

  public String[] getSeries() {
    return series;
  }

  public String[] getOtherMultimedia() {
    return otherMultimedia;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APerformativeArtist that = (APerformativeArtist) o;
    return Objects.deepEquals(movies, that.movies) && Objects.deepEquals(series,
        that.series) && Objects.deepEquals(otherMultimedia, that.otherMultimedia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(movies), Arrays.hashCode(series),
        Arrays.hashCode(otherMultimedia));
  }

  @Override
  public String toString() {
    return "APerformativeArtist{" +
        "movies=" + Arrays.toString(movies) +
        ", series=" + Arrays.toString(series) +
        ", otherMultimedia=" + Arrays.toString(otherMultimedia) +
        ", name=" + name +
        ", age=" + age +
        ", genres=" + Arrays.toString(genres) +
        ", awards=" + Arrays.toString(awards) +
        '}';
  }
}
