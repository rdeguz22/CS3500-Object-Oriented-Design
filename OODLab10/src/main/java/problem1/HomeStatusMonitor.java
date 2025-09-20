package problem1;

import java.util.ArrayList;
import java.util.List;

public class HomeStatusMonitor {

  private List<HomeObserver> observerList;
  private String status;

  public HomeStatusMonitor(List<HomeObserver> observerList, String status) {
    this.observerList = observerList;
    this.status = status;
  }

  public HomeStatusMonitor() {
    this.observerList = new ArrayList<>();
    this.status = "";
  }

  public void addObserver(HomeObserver observer) {
    observerList.add(observer);
  }

  public void notifyObservers(String status) {
    for (HomeObserver observer : observerList) {
      observer.update(status);
    }
  }

  public void setStatus(String status) {
    this.status = status;
    notifyObservers(status);
  }
}
