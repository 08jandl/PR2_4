package Hotel;

public class Guest {

    private String name;
    private Key key;
    private int roomNumber;

    public Guest(String name, Key key, int roomNumber) {
        this.name = name;
        this.key = key;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
