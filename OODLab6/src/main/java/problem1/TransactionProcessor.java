package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TransactionProcessor <T extends Transaction> {

  private List<Transaction> pendingTransaction;
  private List<Transaction> completedTransaction;
  private Map<String, Double> merchantDatabase;
  private static final Double DEFAULT_VALUE = 0.0;

  public TransactionProcessor(List<Transaction> pendingTransaction,
      List<Transaction> completedTransaction, Map<String, Double> merchantDatabase) {
    this.pendingTransaction = pendingTransaction;
    this.completedTransaction = completedTransaction;
    this.merchantDatabase = merchantDatabase;
  }

  public TransactionProcessor() {
    this.pendingTransaction = new ArrayList<Transaction>();
    this.completedTransaction = new ArrayList<>();
  }

  public void addTransaction(Transaction transaction) {
    pendingTransaction.add(transaction);
  }

  public void processTransaction(Transaction transaction) {
    if (transaction.getTransactionType() == TransactionType.CREDIT_CARD_TRANSACTION) {
      CreditCardTransaction creditCardTransaction = (CreditCardTransaction) transaction;
      double value = this.merchantDatabase.getOrDefault(creditCardTransaction.getMerchantId(), DEFAULT_VALUE);
      this.merchantDatabase.put(creditCardTransaction.getMerchantId(), value + creditCardTransaction.getAmount());
    }
  }
}
