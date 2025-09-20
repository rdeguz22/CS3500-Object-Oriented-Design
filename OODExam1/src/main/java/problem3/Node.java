package problem3;

import java.util.Objects;

public class Node {

  private Event first;
  private Node next;

  public Node(Event first, Node next) {
    this.first = first;
    this.next = next;
  }

  public Node(Event first) {
    this.first = first;
    this.next = null;
  }

  public Event getFirst() {
    return first;
  }

  public void setFirst(Event first) {
    this.first = first;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(first, node.first) && Objects.equals(next, node.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, next);
  }
}
