package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FleetManagerTest {

  @Test
  void testDrive1() {
    AVehicle test = new Boat("boat", 11, 22);
    FleetManager fleet = new FleetManager();
    assertEquals(new TripReport(test, 11, 11, 1), fleet.drive(11, test));
  }

  @Test
  void testDrive2() {
    AVehicle test = new Boat("boat", 11, 22);
    FleetManager fleet = new FleetManager();
    assertEquals(new TripReport(test, 11, 11, 1), fleet.drive(test, test.avgSpeed, 11, 1));
  }

  @Test
  void testDrive3() {
    AVehicle test = new Boat("boat", 11, 22);
    FleetManager fleet = new FleetManager();
    assertEquals(new TripReport(test, 11, 11, 1), fleet.drive(11, test, test.avgSpeed));
  }

  @Test
  void testDrive4() {
    AVehicle test = new Boat("boat", 11, 22);
    FleetManager fleet = new FleetManager();
    assertEquals(new TripReport(test, 11, 11, 1), fleet.drive(test, 1));
  }
}