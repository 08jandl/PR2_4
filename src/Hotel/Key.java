package Hotel;

public class Key {

    private int roomNumber;
    private boolean withGuest;

    public Key(int roomNumber, boolean withGuest) {
        this.roomNumber = roomNumber;
        this.withGuest = withGuest;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isWithGuest() {
        return withGuest;
    }

    public void setWithGuest(boolean withGuest) {
        this.withGuest = withGuest;
    }

    @Override
    public String toString() {
        return "Key{" +
                "roomNumber=" + roomNumber +
                ", withGuest=" + withGuest +
                '}';
    }
}
