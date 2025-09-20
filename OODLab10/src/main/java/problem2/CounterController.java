package problem2;

public class CounterController {
  private CounterModel model;
  private CounterView view;

  public CounterController(CounterModel model, CounterView view) {
    this.model = model;
    this.view = view;

    // TODO: Register view as observer of model
    this.model.addObserver(view);

    // TODO: Add action listeners to view buttons
    // Use lambda expressions or method references
    // Example: view.addIncrementListener(e -> /* action */);
    this.view.addIncrementListener(e -> this.model.increment());
    this.view.addDecrementListener(e -> this.model.decrement());
    this.view.addResetListener(e -> this.model.reset());
  }
}

