package option2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class GrammarCollector stores information about the grammar collector
 */
public class GrammarCollector {

  private final List<Grammar> grammars;

  /**
   * Constructor for the class GrammarCollector
   *
   * @param directoryPath - String, the directory path
   */
  public GrammarCollector(String directoryPath) throws IOException {
    this.grammars = new ArrayList<>();
    GrammarParser parser = new GrammarParser();
    File directory = new File(directoryPath);
    if (!directory.isDirectory()) {
      throw new IllegalArgumentException("Not a directory:" + directoryPath);
    }
    File[] files = directory.listFiles((d, name) -> name.endsWith(".json"));
    if (files == null) {
      throw new IOException("No grammar files found.");
    }
    for (File file : files) {
      grammars.add(parser.parse(file));
    }
  }

  /**
   * @return - List<Grammar>, giving the grammar
   */
  public List<Grammar> getGrammars() {
    return grammars;
  }

  /**
   * Gets grammar.
   *
   * @param index - int, the index
   * @return the grammar
   */
  public Grammar getGrammar(int index) {
    return grammars.get(index);
  }
}
