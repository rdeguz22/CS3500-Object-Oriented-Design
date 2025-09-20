package option2;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class SentenceGenerator stores information about the sentence generator
 */
public class SentenceGenerator {

  private final Random random = new Random();

  /**
   * Constructor for the class SentenceGenerator
   */
  public SentenceGenerator() {
  }

  /**
   * Generates a random sentence from the given grammar
   *
   * @param grammar - Grammar, the grammar
   * @return - String, random generated setence
   */
  public String generate(Grammar grammar) {
    List<String> starts = grammar.getStartSymbols();
    String start = starts.get(random.nextInt(starts.size()));
    return expand(start, grammar.getRules()).trim();
  }

  /**
   * Expands a string containing non-terminals using grammar rules.
   *
   * @param text  - String, the text
   * @param rules - Map<String, List<String>>, the grammar rules
   * @return - String, expanded string with non-terminals resolved
   */
  private String expand(String text, Map<String, List<String>> rules) {
    StringBuilder sb = new StringBuilder();
    Pattern pattern = Pattern.compile("<(\\w+)>");
    Matcher matcher = pattern.matcher(text);
    int lastIndex = 0;
    while (matcher.find()) {
      sb.append(text, lastIndex, matcher.start());
      String nonTerminal = matcher.group(1);
      List<String> productions = rules.get(nonTerminal);
      if (productions == null || productions.isEmpty()) {
        sb.append("<").append(nonTerminal).append(">");
      } else {
        String chosen = productions.get(random.nextInt(productions.size()));
        sb.append(expand(chosen, rules));
      }
      lastIndex = matcher.end();
    }
    sb.append(text.substring(lastIndex));
    return sb.toString();
  }
}
