package HW3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgentTest {

  private Agent<ResidentialProperty, Contract> agent;
  private Agent<ResidentialProperty, Contract> agent2;
  private ResidentialProperty property1;
  private ResidentialProperty property2;
  private SaleContract saleContract;
  private RentalContract rentalContract;
  private Listing<ResidentialProperty, Contract> saleListing;
  private Listing<ResidentialProperty, Contract> rentalListing;

  @BeforeEach
  void setUp() {
    agent = new Agent<>("Rico", 0.03);
    agent2 = new Agent<>("Rico", 0.03);
    property1 = new ResidentialProperty("1000 Lenora St.", 1200, 3, 2.5);
    property2 = new ResidentialProperty("11 Avon Ln.", 800, 3, 1.5);
    saleContract = new SaleContract(350000.0, true);
    rentalContract = new RentalContract(2000.0, false, 12);
    saleListing = new Listing<>(property1, saleContract);
    rentalListing = new Listing<>(property2, rentalContract);
  }

  @Test
  void testGetName() {
    assertEquals("Rico", agent.getName());
  }

  @Test
  void testGetCommissionRate() {
    assertEquals(0.03, agent.getCommissionRate());
  }

  @Test
  void testAddListings() {
    agent.addListing(saleListing);
    agent.addListing(rentalListing);
    assertEquals(Arrays.asList(saleListing, rentalListing), agent.getListings());
  }

  @Test
  void testCompleteListingSale() {
    agent.addListing(saleListing);
    agent.completeListing(saleListing);
    assertEquals(Arrays.asList(), agent.getListings());
    assertEquals(10500.0, agent.getTotalEarnings(), 0.0001);
  }

  @Test
  void testCompleteListingRental() {
    agent.addListing(rentalListing);
    agent.completeListing(rentalListing);
    assertEquals(Arrays.asList(), agent.getListings());
    assertEquals(720, agent.getTotalEarnings());
  }

  @Test
  void testCompleteListingNotFound() {
    try {
      agent.completeListing(saleListing);
      fail("Expected IllegalArgumentException to be thrown.");
    } catch (IllegalArgumentException e) {
      assertEquals("Listing not found.", e.getMessage());
    }
  }

  @Test
  void testDropListing() {
    agent.addListing(saleListing);
    agent.dropListing(saleListing);
    assertEquals(0, agent.getTotalPortfolioValue(), 0.001);
  }

  @Test
  void testDropListingNotFound() {
    try {
      agent.dropListing(saleListing);
      fail("Expected IllegalArgumentException to be thrown.");
    } catch (IllegalArgumentException e) {
      assertEquals("Listing not found.", e.getMessage());
    }
  }

  @Test
  void testGetTotalPortfolioValue() {
    agent.addListing(saleListing);
    agent.addListing(rentalListing);
    assertEquals(11220, agent.getTotalPortfolioValue(), 0.0001);
  }

  @Test
  void testEquals() {
    assertTrue(agent.equals(agent2));
  }

  @Test
  void testHashCode() {
    assertEquals(agent.hashCode(), agent2.hashCode());
  }
}