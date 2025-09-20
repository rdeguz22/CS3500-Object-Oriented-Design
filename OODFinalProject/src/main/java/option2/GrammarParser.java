package option2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Class GrammarParser stores information about the grammar parser
 */
public class GrammarParser {

  /**
   * Constructor for the class GrammarParser
   */
  public GrammarParser() {
  }

  /**
   * Parses a JSON grammar file into a Grammar object
   *
   * @param file - File, the JSON file
   * @return - Grammar, giving the parsed Grammar object
   * @throws IOException if the file cannot be read
   */
  public Grammar parse(File file) throws IOException {
    String content = readFileContent(file);
    JSONObject object = new JSONObject(content);
    String title = parseTitle(object);
    String description = parseDescription(object);
    List<String> startSymbols = parseStartSymbols(object);
    Map<String, List<String>> rules = parseRules(object);
    return new Grammar(title, description, startSymbols, rules);
  }

  /**
   * Reads the contents of the file
   *
   * @param file - File, the file
   * @return - String, contents of the file
   * @throws IOException if the file cannot be read
   */
  private String readFileContent(File file) throws IOException {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        sb.append(line).append(System.lineSeparator());
      }
    }
    return sb.toString();
  }

  /**
   * Parses the grammar title from the JSON object
   *
   * @param object - JSONObject, the object
   * @return - String, the grammar title
   */
  private String parseTitle(JSONObject object) {
    return object.getString("grammarTitle");
  }

  /**
   * Parses the grammar description from the JSON object
   *
   * @param object - JSONObject, the object
   * @return - String, the grammar description
   */
  private String parseDescription(JSONObject object) {
    return object.optString("grammarDesc", "");
  }

  /**
   * Parses the grammar entry points from the JSON object
   *
   * @param object - JSONObject, the object
   * @return - List<String>, the entry points
   */
  private List<String> parseStartSymbols(JSONObject object) {
    List<String> startSymbols = new ArrayList<>();
    JSONArray startArray = object.getJSONArray("start");
    for (int i = 0; i < startArray.length(); i++) {
      startSymbols.add(startArray.getString(i));
    }
    return startSymbols;
  }

  /**
   * Parses the grammar rules from the JSON object
   *
   * @param object - JSONObject, the object
   * @return - Map<String, List<String>>, the grammar rules
   */
  private Map<String, List<String>> parseRules(JSONObject object) {
    Map<String, List<String>> rules = new HashMap<>();
    for (String key : object.keySet()) {
      if (!(key.equals("grammarTitle") || key.equals("grammarDesc") || key.equals("start"))) {
        JSONArray array = object.getJSONArray(key);
        List<String> productions = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
          productions.add(array.getString(i));
        }
        rules.put(key, productions);
      }
    }
    return rules;
  }
}
