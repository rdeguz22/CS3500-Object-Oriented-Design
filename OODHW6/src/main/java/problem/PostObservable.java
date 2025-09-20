package problem;

/**
 * Interface PostObservable stores information about an observable post
 */
public interface PostObservable {


  /**
   * Add observer.
   *
   * @param postObserver - PostObserver, the post observer
   */
  void addObserver(PostObserver postObserver);

  /**
   * Remove observer
   *
   * @param postObserver - PostObserver, the post observer
   */
  void removeObserver(PostObserver postObserver);

  /**
   * Notify observers.
   */
  void notifyObservers();
}
