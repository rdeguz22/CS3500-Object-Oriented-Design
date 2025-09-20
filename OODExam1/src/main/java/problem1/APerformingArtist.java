package problem1;

import java.util.List;

public abstract class APerformingArtist extends AArtist{

  protected String[] movies;
  protected String[] series;
  protected String[] otherMultimedia;

  public APerformingArtist(Name name, Integer age, List<String> genres,
      List<String> awards, String[] movies, String[] series, String[] otherMultimedia)
      throws InvalidAgeException {
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
}
