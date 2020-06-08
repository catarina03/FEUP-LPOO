import java.util.ArrayList;

public class Party extends Event{
    private ArrayList<Event> events;

    public Party(String title) {
        super(title);
        events = new ArrayList<>();
    }

    public Party(String title, String date) {
        super(title, date);
        events = new ArrayList<>();
    }

    public Party(String title, String date, String description) {
        super(title, date, description);
        events = new ArrayList<>();
    }

    public Party(Event e) {
        super(e);
        events = new ArrayList<>();
    }

    public void addEvent(Event e) {
        events.add(e);
    }

    @Override
    public int getAudienceCount(){
        int count = 0;
        for (Event e : events){
            count += e.getAudienceCount();
        }
        count += getPeople().size();
        return count;
    }
}
