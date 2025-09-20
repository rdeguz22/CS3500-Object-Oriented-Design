package problem1;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Transaction {

  protected String transactionId;
  protected double amount;
  protected String currency;
  protected TransactionStatus transactionStatus;
  protected LocalDate timeStamp;
  protected static final Double HIGH_VALUE_THRESHOLD = 5000.0;


  public Transaction(String transactionId, double amount, String currency,
      TransactionStatus transactionStatus, LocalDate timeStamp) {
    this.transactionId = transactionId;
    this.amount = amount;
    this.currency = currency;
    this.transactionStatus = transactionStatus;
    this.timeStamp = timeStamp;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public double getAmount() {
    return amount;
  }

  public String getCurrency() {
    return currency;
  }

  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }

  public LocalDate getTimeStamp() {
    return timeStamp;
  }

  protected abstract TransactionType getTransactionType();

  protected abstract Boolean validateTransaction();

  protected abstract Double calculateFees();

  protected Boolean isHighValueTransaction() {
    return this.amount > HIGH_VALUE_THRESHOLD;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction that = (Transaction) o;
    return Double.compare(amount, that.amount) == 0 && Objects.equals(
        transactionId, that.transactionId) && Objects.equals(currency, that.currency)
        && transactionStatus == that.transactionStatus && Objects.equals(timeStamp,
        that.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, amount, currency, transactionStatus, timeStamp);
  }


  @Override
  public String toString() {
    return "Transaction{" +
        "transactionId='" + transactionId + '\'' +
        ", amount=" + amount +
        ", currency='" + currency + '\'' +
        ", transactionStatus=" + transactionStatus +
        ", timeStamp=" + timeStamp +
        '}';
  }
}
