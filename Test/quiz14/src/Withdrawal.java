public class Withdrawal extends Transaction{
    private ATM atm;
    private Session session;
    private Card card;
    private double amount;

    public Withdrawal(ATM atm, Session session, Card card, int amount) {
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

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Withdrawal at ATM " + atm.getID() + " (" + atm.getPlace() + ", " + atm.getCgd() + ") of " + parser(String.format("%.2f", amount));
    }

    public String parser(String s){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ','){
                String s1 = s.substring(0, i);
                String s2 = "." + s.substring(i + 1, s.length());
                String result = s1.concat(s2);
                return result;
            }
        }
        return s;
    }
}
