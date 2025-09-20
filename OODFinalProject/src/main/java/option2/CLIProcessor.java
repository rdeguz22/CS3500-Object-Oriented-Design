package option2;

import java.util.List;
import java.util.Scanner;

/**
 * Class CLIProcessor stores information about the command line interface processor
 */
public class CLIProcessor {

  private final GrammarCollector grammarCollector;
  private final SentenceGenerator generator;
  private final Scanner input;


  /**
   * Constructor for the class CLIProcessor
   *
   * @param collector - GrammarCollector, the collector
   */
  public CLIProcessor(GrammarCollector collector) {
    this.grammarCollector = collector;
    this.generator = new SentenceGenerator();
    this.input = new Scanner(System.in);
  }

  /**
   * Starts the main method for selecting grammars and generating sentences until the user quits
   */
  public void run() {
    System.out.println("Loading grammars...");
    List<Grammar> grammars = grammarCollector.getGrammars();

    while (true) {
      displayGrammarList(grammars);
      Integer grammarIndex = promptGrammarChoice(grammars.size());
      if (grammarIndex == null) {
        break;
      }
      Grammar grammar = grammars.get(grammarIndex);
      System.out.println("\n" + grammar.getDescription());
      interactWithGrammar(grammar);
    }
  }

  /**
   * Displays a numbered list of all loaded grammars
   *
   * @param grammars - List<Grammar>, list of displayed Grammar objects
   */
  private void displayGrammarList(List<Grammar> grammars) {
    System.out.println("\nThe following grammars are available:");
    for (int i = 0; i < grammars.size(); i++) {
      System.out.println((i + 1) + ". " + grammars.get(i).getTitle());
    }
  }

  /**
   * Prompts the user to select a grammar from the list or to quit.
   *
   * @param grammarCount - int, representing the number of available grammars
   * @return - Integer, the index of the selected grammar or null if user quits
   */
  private Integer promptGrammarChoice(int grammarCount) {
    while (true) {
      System.out.println("\nWhich would you like to use? (q to quit): ");
      String scannerInput = input.nextLine().trim();
      if (scannerInput.equalsIgnoreCase("q")) {
        return null;
      }
      try {
        int choice = Integer.parseInt(scannerInput);
        if (choice >= 1 && choice <= grammarCount) {
          return choice - 1;
        }
      } catch (NumberFormatException e) {
      }
      System.out.println("Invalid input. Try again.");
    }
  }

  /**
   * Begins sentence generation interaction given the grammar.
   *
   * @param grammar - Grammar, represents the grammar
   */
  private void interactWithGrammar(Grammar grammar) {
    while (true) {
      String sentence = generator.generate(grammar);
      System.out.println("\n" + sentence);
      if (!promptAnotherSentence()) {
        break;
      }
    }
  }

  /**
   * Prompts the user to generate another sentence
   *
   * @return - Boolean, giving if the user wants another sentence or not
   */
  private boolean promptAnotherSentence() {
    while (true) {
      System.out.println("\nWould you like another? (y/n): ");
      String another = input.nextLine().trim().toLowerCase();
      if (another.equals("y")) {
        return true;
      }
      if (another.equals("n")) {
        return false;
      }
      System.out.println("Please enter 'y' or 'n'.");
    }
  }
}
