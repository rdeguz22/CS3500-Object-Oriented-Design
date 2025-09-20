package problem2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import problem1.Swimmer;

public class SwimmerIterator implements Iterator<Swimmer> {

  private List<Swimmer> swimmers;
  private static final Integer SIZE_THRESHOLD = 5;
  private static final Double TIME_THRESHOLD = 26.17;


  public SwimmerIterator(List<Swimmer> swimmers) {
    this.swimmers = this.filterQualifiedSwimmers(swimmers);
  }

  private List<Swimmer> filterQualifiedSwimmers(List<Swimmer> swimmers) {
    List<Swimmer> filteredSwimmers = new ArrayList<>();
    for (Swimmer swimmer : swimmers) {
      List<Double> butterflyTimes = swimmer.getButterfly50mTimes();
      List<Double> freestyleTimes = swimmer.getFreestyle50mTimes();
      if (butterflyTimes != null && butterflyTimes.size() >= SIZE_THRESHOLD) {
        if (freestyleTimes != null) {
          boolean qualifiedFreestyle = false;
          for (Double time : freestyleTimes) {
            if (time <= TIME_THRESHOLD) {
              qualifiedFreestyle = true;
              break;
            }
          }
          if (qualifiedFreestyle) {
            filteredSwimmers.add(swimmer);
          }
        }
      }
    }
    return filteredSwimmers;
  }

  @Override
  public boolean hasNext() {
    return !this.swimmers.isEmpty();
  }

  @Override
  public Swimmer next() {
    if (swimmers.isEmpty()) {
      throw new NoSuchElementException("No more swimmers.");
    }
    return this.swimmers.remove(0);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("Don't even think about this!");
  }

}
