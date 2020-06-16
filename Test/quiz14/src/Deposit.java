public class Deposit extends Transaction{
    private ATM atm;
    private Session session;
    private Card card;
    private double amount;

    public Deposit(ATM atm, Session session, Card card, double amount) {
        this.atm = atm;
        this.session = session;
        this.card = card;
        this.amount = amount;
    }

    public ATM getAtm() {
        return atm;
    }

    public Session getSession() {
        return session;
    }

    public Card getCard() {
        return card;
    }

    public double getAmount() {
        return amount;
    }


}
