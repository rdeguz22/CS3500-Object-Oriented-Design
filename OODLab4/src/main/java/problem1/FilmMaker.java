package problem1;

import java.util.Arrays;

public class FilmMaker extends APerformativeArtist {

  public FilmMaker(Name name, Integer age, String[] genres, String[] awards, String[] movies,
      String[] series, String[] otherMultimedia) {
    super(name, age, genres, awards, movies, series, otherMultimedia);
  }

  @Override
  public IArtist receiveAward(String award) {
    String[] newAwards = new String[this.getAwards().length + 1];
    newAwards = Arrays.copyOf(this.getAwards(), this.getAwards().length);
    newAwards[newAwards.length - 1] = award;
    try {
      FilmMaker filmMaker = new FilmMaker(this.name, this.age, this.genres, newAwards, this.movies,
          this.series, this.otherMultimedia);
      validateAge(filmMaker.age);
      return filmMaker;
    } catch (InvalidAgeException e) {
      throw new RuntimeException(e);
    }
  }
}
