package option2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Class Grammar stores information about grammar
 */
public class Grammar {

  private final String title;
  private final String description;
  private final List<String> startSymbols;
  private final Map<String, List<String>> rules;

  /**
   * Constructor for the class Grammar
   *
   * @param title        - String, the title
   * @param description  - String, the descpription
   * @param startSymbols - List<String>, the entry points into the grammar
   * @param rules        - Map<String, List<String>>, the grammar rules
   */
  public Grammar(String title, String description, List<String> startSymbols,
      Map<String, List<String>> rules) {
    this.title = title;
    this.description = description;
    this.startSymbols = new ArrayList<>(startSymbols);
    this.rules = new HashMap<>(rules);
  }

  /**
   * @return - String, giving the title of the grammar
   */
  public String getTitle() {
    return title;
  }

  /**
   * @return - String, giving the description of the grammar
   */
  public String getDescription() {
    return description;
  }

  /**
   * @return - List<String>, giving the entry points into the grammar
   */
  public List<String> getStartSymbols() {
    return startSymbols;
  }

  /**
   * @return - Map<String, List<String>>, giving the grammar rules
   */
  public Map<String, List<String>> getRules() {
    return rules;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grammar grammar = (Grammar) o;
    return Objects.equals(title, grammar.title) && Objects.equals(description,
        grammar.description) && Objects.equals(startSymbols, grammar.startSymbols)
        && Objects.equals(rules, grammar.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, startSymbols, rules);
  }

  @Override
  public String toString() {
    return "Grammar{" +
        "title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", startSymbols=" + startSymbols +
        ", rules=" + rules +
        '}';
  }
}
