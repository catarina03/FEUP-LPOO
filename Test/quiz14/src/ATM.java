import java.util.Objects;

public class ATM {
    private int id;
    private String place;
    private String cgd;

    public ATM(int id, String place, String cgd) {
        this.id = id;
        this.place = place;
        this.cgd = cgd;
    }

    public int getID() {
        return id;
    }

    public String getPlace() {
        return place;
    }

    public String getCgd() {
        return cgd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return id == atm.id &&
                Objects.equals(place, atm.place) &&
                Objects.equals(cgd, atm.cgd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, place, cgd);
    }
}
