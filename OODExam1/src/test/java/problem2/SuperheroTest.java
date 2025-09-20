package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem3.InvalidEventIDException;

class SuperheroTest {

  private Superhero superhero;
  private Name name;
  private List<String> powers;
  private List<String> attacks;

  @BeforeEach
  void setUp() {
    name = new Name("The", "Kid", "Flash");
    powers = new ArrayList<>();
    powers.add("Superspeed");
    powers.add("Lightning");
    powers.add("Punch");
    powers.add("Kick");
    superhero = new Superhero(name, 28, 72.0, 200.0, powers, attacks, LocalDate.of(2025, 2, 23),
        150.0, 100.0);
  }

  @Test
  void addNewAbility() throws InvalidAbilityException {
    assertEquals(4, powers.size());
    superhero.addNewAbility("Flying Kick");
    assertEquals(5, powers.size());
  }

  @Test
  void updateDateOfLastBattle() {
    assertTrue(superhero.updateDateOfLastBattle(LocalDate.of(2025, 1, 2)));
    assertFalse(superhero.updateDateOfLastBattle(LocalDate.of(2025, 2, 15)));
  }
}