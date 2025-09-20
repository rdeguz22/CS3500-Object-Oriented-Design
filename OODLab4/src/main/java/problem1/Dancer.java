package problem1;

import java.util.Arrays;

public class Dancer extends APerformativeArtist {

  public Dancer(Name name, Integer age, String[] genres, String[] awards, String[] movies,
      String[] series, String[] otherMultimedia) {
    super(name, age, genres, awards, movies, series, otherMultimedia);
  }

  @Override
  public IArtist receiveAward(String award) {
    String[] newAwards = new String[this.getAwards().length + 1];
    newAwards = Arrays.copyOf(this.getAwards(), this.getAwards().length);
    newAwards[newAwards.length - 1] = award;
    try {
      Dancer dancer = new Dancer(this.name, this.age, this.genres, newAwards, this.movies,
          this.series, this.otherMultimedia);
      validateAge(dancer.age);
      return dancer;
    } catch (InvalidAgeException e) {
      throw new RuntimeException(e);
    }
  }
}
