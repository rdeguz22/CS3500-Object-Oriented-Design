package problem1;

import java.util.Arrays;
import java.util.Objects;

public class Musician extends AArtist {

  protected String recordingCompany;
  protected String lastRecordAlbum;

  public Musician(Name name, Integer age, String[] genres, String[] awards, String recordingCompany,
      String lastRecordAlbum) {
    super(name, age, genres, awards);
    this.recordingCompany = recordingCompany;
    this.lastRecordAlbum = lastRecordAlbum;
  }

  public String getRecordingCompany() {
    return recordingCompany;
  }

  public String getLastRecordAlbum() {
    return lastRecordAlbum;
  }

  @Override
  public IArtist receiveAward(String award) {
    String[] newAwards = new String[this.getAwards().length + 1];
    newAwards = Arrays.copyOf(this.getAwards(), this.getAwards().length);
    newAwards[newAwards.length - 1] = award;
    try {
      Musician musician = new Musician(this.name, this.age, this.genres, newAwards,
          this.recordingCompany, this.lastRecordAlbum);
      validateAge(musician.age);
      return musician;
    } catch (InvalidAgeException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Musician musician = (Musician) o;
    return Objects.equals(recordingCompany, musician.recordingCompany)
        && Objects.equals(lastRecordAlbum, musician.lastRecordAlbum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingCompany, lastRecordAlbum);
  }
}
