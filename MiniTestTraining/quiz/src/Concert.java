import java.util.ArrayList;
import java.util.List;

public class Concert {
    private String city;
    private String country;
    private String date;
    private List<Act> acts;

    public Concert(String city, String country, String date) {
        setCity(city);
        setCountry(country);
        setDate(date);
        acts = new ArrayList<>();
    }

    public List<Act> getActs() {
        return acts;
    }

    public void setActs(List<Act> acts) {
        this.acts = acts;
    }

    public List<Act> addAct(Act act){
        acts.add(act);
        System.out.println(acts.get(0).getCountry());
        return acts;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void assertEquals
}
