package hw1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class IndividualContributor stores information about an individual contributor.
 **/

public class IndividualContributor extends FullTimeEmployee {

  private Integer numberOfPatents;
  private Integer numberOfPublications;
  private Integer numberOfExternalCollaborations;

  private static final Double INDIVIDUAL_CONTRIBUTOR_BONUS = 1.3;
  private static final Integer INDIVIDUAL_CONTRIBUTOR_BONUS_THRESHOLD = 4;

  /**
   * Constructor for the class IndividualContributor.
   *
   * @param employeeId                     - String, representing individual contributor's ID
   * @param contactInfo                    - ContactInfo, representing individual contributor's
   *                                       contact information
   * @param employmentDate                 - LocalDate, representing the date the individual
   *                                       contributor was employed
   * @param employmentLevel                - EmploymentLevel, representing the individual
   *                                       contributor's standing in the company
   * @param lastYearEarnings               - Double, representing the individual contributor's
   *                                       earnings from the past year
   * @param basePay                        - Double, representing the individual contributor's base
   *                                       pay
   * @param bonuses                        - Double, representing the individual contributor's
   *                                       bonuses
   * @param overtime                       - Double, representing the individual contributor's
   *                                       overtime
   * @param lastPromotionDate              - LocalDate, representing the individual contributor's
   *                                       last promotion date
   * @param numberOfPatents                - Integer, representing the individual contributor's
   *                                       number of patents
   * @param numberOfPublications           - Integer, representing the individual contributor's
   *                                       number of publications
   * @param numberOfExternalCollaborations - Integer, representing the individual contributor's
   *                                       number of external collaborations
   **/

  public IndividualContributor(String employeeId, ContactInfo contactInfo, LocalDate employmentDate,
      EmploymentLevel employmentLevel, double lastYearEarnings, double basePay, double bonuses,
      double overtime, LocalDate lastPromotionDate, int numProjects, int numberOfPatents,
      int numberOfPublications, int numberOfExternalCollaborations) {
    super(employeeId, contactInfo, employmentDate, employmentLevel, lastYearEarnings, basePay,
        bonuses, overtime, lastPromotionDate, numProjects);
    this.numberOfPatents = numberOfPatents;
    this.numberOfPublications = numberOfPublications;
    this.numberOfExternalCollaborations = numberOfExternalCollaborations;
  }

  /**
   * @return - Integer, giving individual contributor's number of patents
   */
  public Integer getNumberOfPatents() {
    return numberOfPatents;
  }

  /**
   * @return - Integer, giving individual contributor's number of publications
   */
  public Integer getNumberOfPublications() {
    return numberOfPublications;
  }

  /**
   * @return - Integer, giving individual contributor's number of external collaborations
   */
  public Integer getNumberOfExternalCollaborations() {
    return numberOfExternalCollaborations;
  }

  @Override
  public Double estimateProductivity() {
    double productivity = super.estimateProductivity();
    if (numberOfPublications > INDIVIDUAL_CONTRIBUTOR_BONUS_THRESHOLD) {
      productivity += INDIVIDUAL_CONTRIBUTOR_BONUS;
    }
    return productivity;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualContributor that = (IndividualContributor) o;
    return Objects.equals(numberOfPatents, that.numberOfPatents)
        && Objects.equals(numberOfPublications, that.numberOfPublications)
        && Objects.equals(numberOfExternalCollaborations,
        that.numberOfExternalCollaborations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfPatents, numberOfPublications, numberOfExternalCollaborations);
  }

  @Override
  public String toString() {
    return "IndividualContributor{" +
        "numberOfPatents=" + numberOfPatents +
        ", numberOfPublications=" + numberOfPublications +
        ", numberOfExternalCollaborations=" + numberOfExternalCollaborations +
        ", basePay=" + basePay +
        ", bonuses=" + bonuses +
        ", overtime=" + overtime +
        ", lastPromotionDate=" + lastPromotionDate +
        ", numberOfProjects=" + numberOfProjects +
        ", employeeID='" + employeeID + '\'' +
        ", contactInfo=" + contactInfo +
        ", employmentDate=" + employmentDate +
        ", employmentLevel=" + employmentLevel +
        ", lastYearsEarnings=" + lastYearsEarnings +
        '}';
  }
}
