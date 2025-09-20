package option2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SentenceGeneratorTest {

  private SentenceGenerator generator;
  private Grammar grammar;

  @BeforeEach
  void setUp() {
    Map<String, List<String>> rules = new HashMap<>();
    List<String> start = new ArrayList<>();
    start.add("The <object> <verb> tonight.");
    rules.put("start", start);
    List<String> startSymbols = new ArrayList<>();
    startSymbols.add("start");
    grammar = new Grammar("Poem Generator", "A grammar that generates poems.",
        startSymbols, rules);
    generator = new SentenceGenerator();
  }

  @Test
  void generate() {
    String sentence = generator.generate(grammar);
    assertNotNull(sentence);
    assertTrue(sentence.startsWith("The "));
    assertTrue(sentence.endsWith("."));
  }
}