package problem1;

import java.time.LocalDate;
import java.util.Objects;

public class CreditCardTransaction extends Transaction{

  private static final Integer LOOK_IN_THE_PAST_CONST = 3;
  private static final double CREDIT_CARD_PROCESSING_FEE = 0.025;
  private String maskedCardNumber;
  private String merchantId;
  private Boolean contactlessPaymentFlag;

  public CreditCardTransaction(String transactionId, double amount, String currency,
      TransactionStatus transactionStatus, LocalDate timeStamp, String maskedCardNumber,
      String merchantId, Boolean contactlessPaymentFlag) {
    super(transactionId, amount, currency, transactionStatus, timeStamp);
    this.maskedCardNumber = maskedCardNumber;
    this.merchantId = merchantId;
    this.contactlessPaymentFlag = contactlessPaymentFlag;
  }


  public String getMaskedCardNumber() {
    return maskedCardNumber;
  }

  public String getMerchantId() {
    return merchantId;
  }

  public Boolean getContactlessPaymentFlag() {
    return contactlessPaymentFlag;
  }

  @Override
  protected TransactionType getTransactionType() {
    return TransactionType.CREDIT_CARD_TRANSACTION;
  }

  @Override
  protected Boolean validateTransaction() {
    return this.timeStamp.isAfter(LocalDate.now().minusDays(LOOK_IN_THE_PAST_CONST));
  }

  @Override
  protected Double calculateFees() {
    return this.amount * CREDIT_CARD_PROCESSING_FEE;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CreditCardTransaction that = (CreditCardTransaction) o;
    return Objects.equals(maskedCardNumber, that.maskedCardNumber)
        && Objects.equals(merchantId, that.merchantId) && Objects.equals(
        contactlessPaymentFlag, that.contactlessPaymentFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), maskedCardNumber, merchantId, contactlessPaymentFlag);
  }


  @Override
  public String toString() {
    return "CreditCardTransaction{" +
        "maskedCardNumber='" + maskedCardNumber + '\'' +
        ", merchantId='" + merchantId + '\'' +
        ", contactlessPaymentFlag=" + contactlessPaymentFlag +
        ", transactionId='" + transactionId + '\'' +
        ", amount=" + amount +
        ", currency='" + currency + '\'' +
        ", transactionStatus=" + transactionStatus +
        ", timeStamp=" + timeStamp +
        '}';
  }
}
