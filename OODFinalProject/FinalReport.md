Overview
My chosen project was the Random Sentence Generator, which builds sentences from Context Free
Grammar provided in JSON files. These grammars define rules and placeholders for sentence
generation. The application reads multiple grammars, allows the user to select one through a command
line interface, and then generates random sentences by recursively expanding non-terminals in line
with the rules in the grammar.

High-Level Overview
Grammar Collector loads and stores all grammars from a given directory. Grammar encapsulates a
single grammar’s metadata and rules. GrammarParser reads JSON files and constructs Grammar objects.
SentenceGenerator recursively expands non-terminals to generate sentences. CLIProcessor handles all
user interactions via the command line. Main coordinates startup and command line argument
processing.

Key Challenges
The biggest key challenge was ensuring that all non-terminals expanded correctly. The solution uses
regular expressions to locate the non-terminals, replaces them with randomly chosen productions, and
applies recursion. Additionally, making sure every non-terminal referenced in the grammar is defined
and handling exceptions presented some difficulty, and I added checks and error messages when one
occurred.

Inheritance and Composition
From class SentenceGenerator:
private final GrammarCollector grammarCollector;
private final SentenceGenerator generator;
This is an example of composition because SentenceGenerator uses a GrammarCollector and a
SentenceGenerator. There are no examples of inheritance because I found composition to be used in
this scenario rather than inheritance and was in accordance with the dependency inversion principle.

Interface or Abstract class
I did not implement any interfaces or abstract classes. I implemented all functionality using
concrete classes and used java’s built in interfaces of List and Map to manage the program. It could
be used in an interface for user interaction.

Method Overriding and Method Overloading
From class Grammar:
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
This is an example of method overriding because I am overriding the Object method equals(). I did
not use method overloading in my code, as all methods had unique names and signatures. If I saw
multiple methods were fit, I would have implemented method overloading.

Encapsulation
From class Grammar:
private final String title;
public String getTitle() {
return title;
}
This is an example of encapsulation because the field title is private and is accessed through a
public getter, ensuring encapsulation.

Subtype Polymorphism
I did not integrate subtype polymorphism as I found it more efficient to have only one
implementation for each component. It could be introduced by abstracting grammar loading or output
handling with interfaces.

Generics
From class Grammar:
private final Map<String, List<String>> rules;
This is an example of generics because it provides type safety of the grammar rules map.

Built-in Data Collections
From class Grammar:
private final Map<String, List<String>> rules;
this.rules = new HashMap<>(rules);
This is an example of built-in data collections because Map is used throughout for storing grammar
rules.

Iterable and Iterator
I did not implement Iterable or Iterator in my program as all iteration was performed using built-in
data collections.

Comparable and Comparator
I did not implement Comparable or use a Comparator in my code as I saw no need to sort through
objects.

Regular Expressions
Pattern pattern = Pattern.compile("<(\\w+)>");
This is an example of regular expressions because it uses regex to find non-terminal patterns for
expansion.

Nested Classes
I did not use any nested classes as each component was separated into its own class.

Components of Functional Programming
File[] files = directory.listFiles((d, name) -> name.endsWith(".json"));
This is an example of components of functional programming because the lambda expression used
filters through the grammar files.

Creational, Structural, Behavioral Design Patterns
I followed Strategy Behavioral Pattern in the SentenceGenerator class, handling rule expansion
recursively without changing the CLIProcessor or Grammar classes. However, a single strategy is not
explicitly used as all classes were directly instantiated. If I were to use these patterns, I would
apply them to support different types of sentence generation algorithms.

MVC Architecture
Model: Grammar, SentenceGenerator
View: Console output in the CLIProcessor
Controller: User input handled in the CLIProcessor

Data and Stamp Coupling
From class SentenceGenerator:
public String generate(Grammar grammar) {
List<String> starts = grammar.getStartSymbols();
String start = starts.get(random.nextInt(starts.size()));
return expand(start, grammar.getRules()).trim();
}
This is an example of data coupling because the classes Grammar and SentenceGenerator interact in
this method. This is an example of stamp coupling because the whole Grammar is used instead of just
the needed data.
