public abstract class Person extends User implements Comparable{

    public Person(String name) {
        super(name);
    }

    public Person(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(Object o){
        return this.getName().compareTo(((Person) o).getName());
    }
}
