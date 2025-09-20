package option2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrammarParserTest {

  private Path testFile;
  private GrammarParser parser;

  @BeforeEach
  void setUp() throws IOException {
    parser = new GrammarParser();
    String grammarJson = """
        {
          "grammarTitle": "Test Grammar",
          "grammarDesc": "Temporary test grammar",
          "start": ["<greeting>"],
          "greeting": ["Hello", "Hi", "Hey"]
        }
        """;
    testFile = Files.createTempFile("grammar", ".json");
    Files.writeString(testFile.resolve("test_grammar.json"), grammarJson);
  }

  @Test
  void parse() throws IOException {
    Grammar grammar = parser.parse(testFile.toFile());
    assertNotNull(grammar);
    assertEquals("Test Grammar", grammar.getTitle());
    assertEquals("Temporary test grammar", grammar.getDescription());
    assertTrue(grammar.getStartSymbols().contains("<greeting>"));
    assertTrue(grammar.getRules().containsKey("greeting"));
  }
}