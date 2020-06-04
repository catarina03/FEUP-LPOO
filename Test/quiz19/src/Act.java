import java.util.Objects;

public abstract class Act {
    private String name;
    private String country;

    public Act(){
        this.name = "";
        this.country = "";
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Act act = (Act) o;
        return act.getName().equals(this.getName()) && act.getCountry().equals(this.getCountry());
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }
}
