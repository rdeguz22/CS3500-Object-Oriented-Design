package problem1;

import java.util.List;
import java.util.Objects;

public abstract class AArtist implements IArtist {

  private static final int MIN_AGE = 0;
  private static final int MAX_AGE = 128;
  protected Name name;
  protected Integer age;
  protected List<String> genres;
  protected List<String> awards;

  private Boolean validateAge(int age) throws InvalidAgeException {
    if (age >= MIN_AGE && age <= MAX_AGE) {
      return true;
    } else {
      throw new InvalidAgeException("Age has to have a value in range 0 - 128!");
    }
  }

  public AArtist(Name name, Integer age, List<String> genres, List<String> awards)
      throws InvalidAgeException {
    if (this.validateAge(age)) {
      this.name = name;
      this.age = age;
      this.genres = genres;
      this.awards = awards;
    }
  }

  public Name getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public List<String> getGenres() {
    return genres;
  }

  public List<String> getAwards() {
    return awards;
  }

  @Override
  public void receiveAward(String award) {
    this.awards.add(award);

  }

  @Override
  public void updateGenres(String genres) {
    if (this.genres.contains(genres)) {
      return;
    } else {
      this.genres.add(genres);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AArtist aArtist = (AArtist) o;
    return Objects.equals(name, aArtist.name) && Objects.equals(age, aArtist.age)
        && Objects.equals(genres, aArtist.genres) && Objects.equals(awards,
        aArtist.awards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, genres, awards);
  }

  @Override
  public String toString() {
    return "AArtist{" +
        "name=" + name +
        ", age=" + age +
        ", genres=" + genres +
        ", awards=" + awards +
        '}';
  }
}