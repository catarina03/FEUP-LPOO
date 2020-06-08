import java.util.ArrayList;
import java.util.Objects;

public class Event {
    private String title;
    private String date;
    private String description;
    private ArrayList<Person> people;

    public Event(String title) {
        this.title = title;
        this.date = "";
        this.description = "";
        this.people = new ArrayList<>();
    }

    public Event(String title, String date) {
        this.title = title;
        this.date = date;
        this.description = "";
        this.people = new ArrayList<>();
    }

    public Event(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.people = new ArrayList<>();
    }

    public Event(Event e){
        this.title = e.getTitle();
        this.date = e.getDate();
        this.description = e.getDescription();
        this.people = e.getPeople();
    }

    @Override
    public String toString(){
        return title +" is a "+ description +" and will be held at "+ date +".";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o.getClass() != this.getClass() || o.getClass() == null) return false;
        return this.title.equals(((Event) o).getTitle()) &&
                this.date.equals(((Event) o).getDate()) &&
                this.description.equals(((Event) o).getDescription()) &&
                this.people.equals(((Event) o).getPeople());
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, date, description, people);
    }

    public void addPerson(Person p){
        for (Person person : people){
            if (p.getName().equals(person.getName())) return;
        }
        people.add(p);
    }

    public int getAudienceCount(){
        return people.size();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }
}
