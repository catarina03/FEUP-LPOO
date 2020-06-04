import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {
    private String city;
    private String country;
    private String date;
    private List<Act> acts;
    private int ticketsSold;

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

    public int getTicketsSold() {
        return ticketsSold;
    }

    public void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
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

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return concert.getCity().equals(this.getCity()) &&
                concert.getCountry().equals(this.getCountry()) &&
                concert.getDate().equals(this.getDate()) &&
                concert.getActs().equals(this.getActs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, date, acts);
    }

    public boolean isValid(Ticket ticket){
        return this.equals(ticket.getConcert());
    }

    public boolean participates(Artist artist){
        for (Act act : acts){
            if (act.getClass() == Artist.class && act.equals((Act) artist)){
                return true;
            }
            if (act.getClass() == Band.class)
                for (Artist member : ((Band) act).getArtists()){
                    if (member.equals(artist)) return true;
                }
        }
        return false;
    }
}
