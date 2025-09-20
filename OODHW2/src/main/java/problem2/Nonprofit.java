package problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Nonprofit stores information about a nonprofit
 */

public class Nonprofit {

  private final String name;
  private final List<Donation> donations;


  /**
   * Constructor for the class Nonprofit.
   *
   * @param name - String, representing the name of the nonprofit
   **/
  public Nonprofit(String name) {
    this.name = name;
    this.donations = new ArrayList<>();
  }

  /**
   * @return - String, giving the name of the nonprofit
   */
  public String getName() {
    return name;
  }

  /**
   * @param donation - Donation, representing the donation being added to the nonprofit adds a
   *                 donation to the nonprofit
   */
  public void addDonation(Donation donation) {
    donations.add(donation);
  }

  /**
   * @param year - int, representing the year that you want to get the total donations from
   * @return - Double, giving the total donations from the year
   */
  public Double getTotalDonationsForYear(int year) {
    double total = 0.0;
    for (Donation d : donations) {
      total += d.getAmountForYear(year);
    }
    return total;
  }
}