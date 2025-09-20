package HW3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RentalContractTest {

  private RentalContract contract;

  @BeforeEach
  void setUp() {
    contract = new RentalContract(1500.0, false, 12);
  }

  @Test
  void testGetAskingPrice() {
    assertEquals(1500.0, contract.getAskingPrice());
  }

  @Test
  void testGetNegotiable() {
    assertFalse(contract.getNegotiable());
  }

  @Test
  void testGetTermMonths() {
    assertEquals(12, contract.getTermMonths());
  }

  @Test
  void testGetCommission() {
    assertEquals(18000, contract.getCommission());
  }
}