package problem1;

import java.util.Arrays;

public class Photographer extends AVisualArtist {

  public Photographer(Name name, Integer age, String[] genres, String[] awards, String[] exhibits) {
    super(name, age, genres, awards, exhibits);
  }

  @Override
  public IArtist receiveAward(String award) {
    String[] newAwards = new String[this.getAwards().length + 1];
    newAwards = Arrays.copyOf(this.getAwards(), this.getAwards().length);
    newAwards[newAwards.length - 1] = award;
    try {
      Photographer photographer = new Photographer(this.name, this.age, this.genres, newAwards,
          this.exhibits);
      validateAge(photographer.age);
      return photographer;
    } catch (InvalidAgeException e) {
      throw new RuntimeException(e);
    }
  }
}
