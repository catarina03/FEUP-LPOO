import java.util.ArrayList;
import java.util.Objects;

public class Session implements Countable{
    private ATM atm;
    private ArrayList<Transaction> transactions;

    public Session(ATM atm) {
        this.atm = atm;
        this.transactions = new ArrayList<>();
    }

    public ATM getATM() {
        return atm;
    }

    public void addTransaction(Transaction w) {
        transactions.add(w);
    }

    @Override
    public int count(){
        return transactions.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return Objects.equals(atm, session.atm) &&
                Objects.equals(transactions, session.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atm, transactions);
    }
}
