import java.util.ArrayList;
import java.util.List;

public class FinanceService {
    private double balance;
    private List<String> billingHistory;
    private List<String> payments;

    public FinanceService() {
        this.balance = 0.0;
        this.billingHistory = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    public void addBalance(double sum) {
        balance += sum;
        billingHistory.add("Deposited: " + sum);
    }

    public double getBalance() { return balance; }

    public List<String> getBillingHistory() { return billingHistory; }

    public List<String> getPayments() { return payments; }
}
