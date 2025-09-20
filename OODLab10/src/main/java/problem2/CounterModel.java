package problem2;

import java.util.ArrayList;
import java.util.List;

public class CounterModel {
  private int count = 0;
  private List<CounterObserver> observers = new ArrayList<>();

  public int getCount() {
    return count;
  }

  public void increment() {
    count++;
    notifyObservers();
  }

  public void decrement() {
    this.count = this.count - 1;
    notifyObservers();
  }

  public void reset() {
    count = 0;
    notifyObservers();
  }

  public void addObserver(CounterObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(CounterObserver observer) {
    observers.remove(observer);
  }

  private void notifyObservers() {
    for (CounterObserver observer : observers) {
      observer.update(this);
    }
  }
}
