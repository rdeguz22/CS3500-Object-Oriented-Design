package HW3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListingTest {

  private ResidentialProperty property;
  private SaleContract contract;
  private Listing<ResidentialProperty, SaleContract> listing;

  @BeforeEach
  void setUp() {
    property = new ResidentialProperty("1000 Lenora St.", 1200, 3, 2.5);
    contract = new SaleContract(350000.0, true);
    listing = new Listing<>(property, contract);
  }

  @Test
  void getProperty() {
    assertEquals(property, listing.getProperty());
  }

  @Test
  void getContract() {
    assertEquals(contract, listing.getContract());
  }
}