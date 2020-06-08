public class Attendee extends Person {
    private boolean paid;

    public Attendee(String name, int age) {
        super(name, age);
        paid = false;
    }

    public Attendee(String name) {
        super(name);
        paid = false;
    }

    public boolean hasPaid() {
        return paid;
    }

    public String toString(){
        return "Attendee "+ this.getName() + (this.hasPaid() ? " has":" hasn't")+" paid its registration.";
    }
}
