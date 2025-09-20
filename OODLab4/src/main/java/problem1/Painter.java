package problem1;

import java.util.Arrays;

public class Painter extends AVisualArtist {

  public Painter(Name name, Integer age, String[] genres, String[] awards, String[] exhibits) {
    super(name, age, genres, awards, exhibits);
  }

  @Override
  public IArtist receiveAward(String award) {
    String[] newAwards = new String[this.getAwards().length + 1];
    newAwards = Arrays.copyOf(this.getAwards(), this.getAwards().length);
    newAwards[newAwards.length - 1] = award;
    try {
      Painter painter = new Painter(this.name, this.age, this.genres, newAwards, this.exhibits);
      validateAge(painter.age);
      return painter;
    } catch (InvalidAgeException e) {
      throw new RuntimeException(e);
    }
  }
}
