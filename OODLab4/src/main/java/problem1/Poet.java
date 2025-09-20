package problem1;

import java.util.Arrays;

public class Poet extends AArtist {

  protected String publishingCompany;
  protected String lastPublishedCollection;

  public Poet(Name name, Integer age, String[] genres, String[] awards, String publishingCompany,
      String lastPublishedCollection) {
    super(name, age, genres, awards);
    this.publishingCompany = publishingCompany;
    this.lastPublishedCollection = lastPublishedCollection;
  }

  @Override
  public IArtist receiveAward(String award) {
    String[] newAwards = new String[this.getAwards().length + 1];
    newAwards = Arrays.copyOf(this.getAwards(), this.getAwards().length);
    newAwards[newAwards.length - 1] = award;
    try {
      Poet poet = new Poet(this.name, this.age, this.genres, newAwards, this.publishingCompany,
          this.lastPublishedCollection);
      validateAge(poet.age);
      return poet;
    } catch (InvalidAgeException e) {
      throw new RuntimeException(e);
    }
  }
}
