package problem1;


import java.util.List;

public class Actor extends APerformingArtist {

  public Actor(Name name, Integer age, List<String> genres, List<String> awards,
      String[] movies, String[] series, String[] otherMultimedia) throws InvalidAgeException {
    super(name, age, genres, awards, movies, series, otherMultimedia);
  }

  public Actor(Name name, Integer age, List<String> genres, List<String> awards,
      String[] movies, String[] series) throws InvalidAgeException {
    super(name, age, genres, awards, movies, series, null);
  }

  @Override
  public void receiveAward(String award) {
    if(!award.equals("Razzie"))
      super.receiveAward(award);
  }


}
