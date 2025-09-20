package HW3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Class Agent stores information about an Agent
 */
public class Agent<T extends Property, U extends Contract> {

  private final String name;
  private final Double commissionRate;
  private Double totalEarnings;
  private final Set<Listing<T, ? extends U>> listings;

  /**
   * Constructor for the class Agent
   *
   * @param name           - String, the name
   * @param commissionRate - Double, the commission rate
   */
  public Agent(String name, Double commissionRate) {
    if (commissionRate < 0 || commissionRate > 1) {
      throw new IllegalArgumentException("Commission rate must be between 0 and 1");
    }
    this.name = name;
    this.commissionRate = commissionRate;
    this.totalEarnings = 0.0;
    this.listings = new HashSet<>();
  }

  /**
   * @return - String, giving the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return - Double, giving the commission rate
   */
  public Double getCommissionRate() {
    return commissionRate;
  }

  /**
   * @return - Double, giving the total earnings
   */
  public Double getTotalEarnings() {
    return totalEarnings;
  }

  /**
   * @return - Set<Listing<T, U>>, giving the listings
   */
  public Set<Listing<T, ? extends U>> getListings() {
    return listings;
  }

  /**
   * adds a listings
   *
   * @param listing - Set<Listing<T, U>>, the listing
   */
  public void addListing(Listing<T, ? extends U> listing) {
    listings.add(listing);
  }


  /**
   * Completes a listing by removing a complete listing and adds to the total earnings from a
   * complete sale.
   *
   * @param listing - Set<Listing<T, U>>, the listing
   */
  public void completeListing(Listing<T, ? extends U> listing) {
    if (listings.remove(listing)) {
      double commission = commissionRate * listing.getContract().getCommission();
      totalEarnings += commission;
    } else {
      throw new IllegalArgumentException("Listing not found.");
    }
  }

  /**
   * Drops a listing from the listings.
   *
   * @param listing - Set<Listing<T, U>>, the listing
   */
  public void dropListing(Listing<T, ? extends U> listing) {
    if (!listings.remove(listing)) {
      throw new IllegalArgumentException("Listing not found.");
    }
  }

  /**
   * Gets total portfolio value.
   *
   * @return - Double, the total portfolio value
   */
  public Double getTotalPortfolioValue() {
    double sum = 0.0;
    for (Listing<T, ? extends U> listing : listings) {
      sum += commissionRate * listing.getContract().getCommission();
    }
    return sum;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent<?, ?> agent = (Agent<?, ?>) o;
    return Objects.equals(name, agent.name) && Objects.equals(commissionRate,
        agent.commissionRate) && Objects.equals(totalEarnings, agent.totalEarnings)
        && Objects.equals(listings, agent.listings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, commissionRate, totalEarnings, listings);
  }
}
