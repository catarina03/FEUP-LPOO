import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.Set;

public class Room extends Facility{
    private Building building;
    private String number;
    private String name;
    private int floor;
    private int capacity;

    public Room(Building building, String number, int floor) throws DuplicateRoomException {
        if (floor > building.getMaxFloor() || floor < building.getMinFloor()) throw new IllegalArgumentException();
        this.building = building;
        this.number = number;
        this.name = building.getName() + number;
        this.floor = floor;
        this.capacity = 0;

        for (Room r : this.building.getRooms()){
            if (r.building.equals(building) && r.number.equals(number) && r.floor == floor){
                throw new DuplicateRoomException();
            }
        }

        ArrayList<Room> rooms_tmp = this.building.getRooms();
        rooms_tmp.add(this);
        this.building.setRooms(rooms_tmp);
    }

    public Room(Building building, String number, int floor, int capacity) throws DuplicateRoomException {
        this.building = building;
        this.number = number;
        this.name = building.getName() + number;
        this.floor = floor;
        this.capacity = capacity;

        this.building.setCapacity(this.building.getCapacity() + capacity);

        for (Room r : this.building.getRooms()){
            if (r.building.equals(building) && r.number.equals(number) && r.floor == floor){
                throw new DuplicateRoomException();
            }
        }

        ArrayList<Room> rooms_tmp = this.building.getRooms();
        rooms_tmp.add(this);
        this.building.setRooms(rooms_tmp);
    }

    public Building getBuilding() {
        return building;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getFloor() {
        return floor;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void authorize(User u){
        ArrayList<User> users = this.getAuthorized();
        users.add(u);
        this.setAuthorized(users);
    }

    @Override
    public boolean canEnter(User u){
        for (User user : this.getAuthorized()){
            if (user.getName().equals(u.getName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Room(" + building.getName() + "," + number + ')';
    }
}
