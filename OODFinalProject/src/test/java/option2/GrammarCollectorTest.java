package option2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrammarCollectorTest {

  private Path testFile;

  @BeforeEach
  void setUp() throws IOException {
    testFile = Files.createTempDirectory("grammar");
    String grammarJson = """
        {
          "grammarTitle": "Test Grammar",
          "grammarDesc": "Temporary test grammar",
          "start": ["<greeting>"],
          "greeting": ["Hello", "Hi", "Hey"]
        }
        """;
    Files.writeString(testFile.resolve("test_grammar.json"), grammarJson);
  }


  @Test
  void testGetGrammars() throws IOException {
    GrammarCollector collector = new GrammarCollector(testFile.toString());
    List<Grammar> grammars = collector.getGrammars();
    Grammar grammar = grammars.get(0);
    assertEquals("Test Grammar", grammar.getTitle());
    assertEquals("Temporary test grammar", grammar.getDescription());
    assertTrue(grammar.getStartSymbols().contains("<greeting>"));
    assertTrue(grammar.getRules().containsKey("greeting"));
  }

  @Test
  void testGetGrammar() throws IOException {
    GrammarCollector collector = new GrammarCollector(testFile.toString());
    Grammar grammar = collector.getGrammar(0);
    assertNotNull(grammar);
    assertEquals("Test Grammar", grammar.getTitle());
    assertEquals("Temporary test grammar", grammar.getDescription());
    assertTrue(grammar.getStartSymbols().contains("<greeting>"));
    assertTrue(grammar.getRules().containsKey("greeting"));
  }
}