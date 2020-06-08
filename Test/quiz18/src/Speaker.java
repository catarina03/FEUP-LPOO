public class Speaker extends Person {
    private int fee;

    public Speaker(String name) {
        super(name);
    }

    public Speaker(String name, int age) {
        super(name, age);
    }

    public int getFee() {
        return fee;
    }

    public String toString(){
        return "Speaker "+this.getName()+" as a fee value of "+this.getFee()+".";
    }
}
