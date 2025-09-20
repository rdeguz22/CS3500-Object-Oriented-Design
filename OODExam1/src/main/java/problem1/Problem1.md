//Problem 1
//Part 1
Code snippet showing input validation:

From class AArtist:

private Boolean validateAge(int age) throws InvalidAgeException {
if (age >= MIN_AGE && age <= MAX_AGE) {
return true;
} else {
throw new InvalidAgeException("Age has to have a value in range 0 - 128!");
}
}

This is an example of input validation because the method checks if the age is within the valid
range.

//Part B
Code snippet showing inheritance:

From class Actor:

public class Actor extends APerformingArtist {

public Actor(Name name, Integer age, List<String> genres, List<String> awards,
String[] movies, String[] series, String[] otherMultimedia) throws InvalidAgeException {
super(name, age, genres, awards, movies, series, otherMultimedia);
}

This is an example of inheritance because Actor inherits the attributes of APerformingArtist as
shown in the constructor.

//Part C
Code snippet showing a class implementing an interface:

From class AArtist:

public abstract class AArtist implements IArtist {

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

This is an example of a class implementing an interface because AArtist implements IArtist in its
class initialization and it implements the interfaces methods with override.

//Part D
Code snippet showing method overriding

From class AArtist:

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

This is an example of method overriding because in the class AArtist the Object methods equals(),
hashCode(), and toString() are being overriden.

//Part E
Code snippet showing method overloading

From class Actor:

public Actor(Name name, Integer age, List<String> genres, List<String> awards,
String[] movies, String[] series, String[] otherMultimedia) throws InvalidAgeException {
super(name, age, genres, awards, movies, series, otherMultimedia);
}

public Actor(Name name, Integer age, List<String> genres, List<String> awards,
String[] movies, String[] series) throws InvalidAgeException {
super(name, age, genres, awards, movies, series, null);
}

This is an example of method overloading as seen in the two constructors differing in having the
parameter String[] otherMultimedia or not.

//Part F

Code snippet showing casting

None

//Part G

Code snippet showing use of generics

None

//Part H
Code snippet showing exception throwing

From class AArtist:

private Boolean validateAge(int age) throws InvalidAgeException {
if (age >= MIN_AGE && age <= MAX_AGE) {
return true;
} else {
throw new InvalidAgeException("Age has to have a value in range 0 - 128!");
}
}

This is an example of exception throwing because if the age is not within the valid range, the
exception InvalidAgeException is thrown.