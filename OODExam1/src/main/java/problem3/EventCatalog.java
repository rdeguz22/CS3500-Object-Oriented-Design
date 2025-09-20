package problem3;

import java.time.LocalDate;
import java.util.List;

public interface EventCatalog {

  int numberOfEvents();

  void addEvent(Event event);

  Boolean contains(Event event);

  List<Event> eventsScheduledOnSameDate(LocalDate requestedDate);

  Event getEventBasedOnEventID(Event event) throws InvalidEventIDException;
}
