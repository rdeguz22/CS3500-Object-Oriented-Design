package problem1;

public abstract class AArtist implements IArtist {

  protected Name name;
  protected Integer age;
  protected String[] genres;
  protected String[] awards;

  private static final int MIN_AGE = 0;
  private static final int MAX_AGE = 128;

  public Name getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public String[] getGenres() {
    return genres;
  }

  public String[] getAwards() {
    return awards;
  }

  public AArtist(Name name, Integer age, String[] genres, String[] awards) {
    this.name = name;
    this.age = age;
    this.genres = genres;
    this.awards = awards;
  }

  protected Boolean validateAge(int age) throws InvalidAgeException {
    if (age >= MIN_AGE && age <= MAX_AGE) {
      return true;
    } else {
      throw new InvalidAgeException("Age must be a value within the range 0-128");
    }
  }

  @Override
  public abstract IArtist receiveAward(String award);
}
