import java.util.ArrayList;

public abstract class Facility {
    private ArrayList<User> authorized = new ArrayList<>();

    public abstract String getName();

    public abstract void authorize(User u1);

    public ArrayList<User> getAuthorized() {
        return authorized;
    }

    public void setAuthorized(ArrayList<User> authorized) {
        this.authorized = authorized;
    }

    public abstract boolean canEnter(User u1);
}
