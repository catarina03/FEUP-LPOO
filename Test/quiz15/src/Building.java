import java.util.ArrayList;
import java.util.Set;

public class Building extends Facility{
    private String name;
    private int minFloor;
    private int maxFloor;
    private int capacity;
    private ArrayList<Room> rooms;

    public Building(String name, int minFloor, int maxFloor) {
        if (minFloor > maxFloor) throw new IllegalArgumentException();
        this.name = name;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.capacity = 0;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean canEnter(User u){
        for (Room room : rooms){
            if (room.canEnter(u)) return true;
        }
        return false;
    }

    @Override
    public void authorize(User u){
    }


    @Override
    public String toString() {
        return "Building(" + name + ')';
    }

}
