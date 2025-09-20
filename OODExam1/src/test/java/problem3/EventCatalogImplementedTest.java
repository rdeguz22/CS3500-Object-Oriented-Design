package problem3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EventCatalogImplementedTest {

  private EventCatalogImplemented catalog;
  private Node head;
  private Event event;
  private Name name;
  private Name[] eventTeam;
  private CustomerInfo contact;

  @BeforeEach
  void setUp() {
    catalog = new EventCatalogImplemented(head);
    event = new Event(12345, "Event", name, eventTeam, contact, LocalDate.of(2025, 1, 2), 5, 6);
    catalog.addEvent(event);
  }

  @Test
  void numberOfEvents() {
    assertEquals(1, catalog.numberOfEvents());
  }

  @Test
  void getEventBasedOnEventID() {
    assertEquals(event, catalog.getEventBasedOnEventID(event));
  }
}