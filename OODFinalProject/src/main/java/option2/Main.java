package option2;

public class Main {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java option2.Main <grammar-directory>");
      System.exit(1);
    }
    try {
      GrammarCollector collector = new GrammarCollector(args[0]);
      CLIProcessor processor = new CLIProcessor(collector);
      processor.run();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
