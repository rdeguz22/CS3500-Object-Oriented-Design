package problem3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventCatalogImplemented implements EventCatalog {

  private Node head;
  private int numEvents;

  public EventCatalogImplemented(Node head) {
    this.head = head;
    this.numEvents = 1;
  }

  @Override
  public int numberOfEvents() {
    return numEvents;
  }

  @Override
  public void addEvent(Event event) {
    if (this.head == null) {
      this.head = new Node(event);
      numEvents++;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      Node newNode = new Node(event);
      current.setNext(newNode);
    }
  }

  @Override
  public Boolean contains(Event event) {
    Node current = head;
    if (current.getFirst().getEventID().equals(event.getEventID())) {
      return true;
    } else {
      current = current.getNext();
    }
    return false;
  }

  @Override
  public List<Event> eventsScheduledOnSameDate(LocalDate requestedDate) {
    List<Event> result = new ArrayList<>();
    Node current = head;
    while (current != null) {
      if (current.getFirst().getEventDate().equals(requestedDate)) {
        result.add(new Event(current.getFirst().getEventID(), current.getFirst().getEventName(),
            current.getFirst().getLeadEventManager(), current.getFirst().getEventTeam(),
            current.getFirst().getCustomerContact(), current.getFirst().getEventDate(),
            current.getFirst().getNumGuests(), current.getFirst().getDuration()));
      }
      current = current.getNext();
    }
    return result;
  }

  @Override
  public Event getEventBasedOnEventID(Event event) throws InvalidEventIDException {
    Node current = head;
    while (current != null) {
      if (current.getFirst().getEventID().equals(event.getEventID())) {
        return new Event(current.getFirst().getEventID(), current.getFirst().getEventName(),
            current.getFirst().getLeadEventManager(), current.getFirst().getEventTeam(),
            current.getFirst().getCustomerContact(), current.getFirst().getEventDate(),
            current.getFirst().getNumGuests(), current.getFirst().getDuration());
      }
      current = current.getNext();
    }
    throw new InvalidEventIDException("Event not found");
  }
}