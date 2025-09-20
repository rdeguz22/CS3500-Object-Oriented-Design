package HW3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SaleContractTest {

  private SaleContract contract;

  @BeforeEach
  void setUp() {
    contract = new SaleContract(250000.0, true);
  }

  @Test
  void testGetAskingPrice() {
    assertEquals(250000.0, contract.getAskingPrice());
  }

  @Test
  void testGetNegotiable() {
    assertEquals(true, contract.getNegotiable());
  }

  @Test
  void testGetCommission() {
    assertEquals(contract.askingPrice, contract.getCommission());
  }
}