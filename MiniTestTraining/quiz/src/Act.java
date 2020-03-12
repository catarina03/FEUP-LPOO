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
}
