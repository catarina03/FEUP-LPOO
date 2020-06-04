import java.util.ArrayList;

public class Band extends Act {
    private String name;
    private String country;
    private ArrayList<Artist> artists;

    public Band(String name, String country) {
        this.name = name;
        this.country = country;
        this.artists = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addArtist(Artist artist){
        this.artists.add(artist);
    }

    public boolean containsArtist(Artist artist){
        for (Artist value : artists) {
            if (value.equals(artist)) {
                return true;
            }
        }
        return false;
    }
}
