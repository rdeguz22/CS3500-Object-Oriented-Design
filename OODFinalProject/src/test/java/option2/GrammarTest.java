package option2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrammarTest {

  private Grammar grammar;
  private Map<String, List<String>> rules;

  @BeforeEach
  void setUp() {
    rules = new HashMap<>();
    List<String> start = new ArrayList<>();
    start.add("The <object> <verb> tonight.");
    rules.put("start", start);
    List<String> startSymbols = new ArrayList<>();
    startSymbols.add("start");
    grammar = new Grammar("Poem Generator", "A grammar that generates poems.",
        startSymbols, rules
    );
  }

  @Test
  void testGetTitle() {
    assertEquals("Poem Generator", grammar.getTitle());
  }

  @Test
  void testGetDescription() {
    assertEquals("A grammar that generates poems.", grammar.getDescription());
  }

  @Test
  void testGetStartSymbols() {
    assertEquals(Arrays.asList("start"), grammar.getStartSymbols());
  }

  @Test
  void testGetRules() {
    assertEquals(rules, grammar.getRules());
  }
}