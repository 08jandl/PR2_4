package Hotel;

public class KeyRack {
    private int numberOfRooms;
    // Our keyrack consists of keys, a specific number of keys, corresponding to the number of rooms in our hotel
    // That's why we are using an array here to hold our keys
    private Key[] keys;

    public KeyRack(int numberOfRooms, Key[] keys) {
        this.numberOfRooms = numberOfRooms;
        this.keys = keys;
    }

    public void giveKeyToGuest(Guest guest){
        // our guest knows in which they are staying, so we get the room number from there
        int roomNumber = guest.getRoomNumber();
        // then we get the key for the room number
        // we are getting the one at space -1 in the array, because the array starts counting at zero, but our rooms don't
        Key key = keys[roomNumber-1];

        // We will only give a key to a guest, if it is actually in the keyrack, so we check whether it is there
        if (key != null) {
            // since there is a key, we give it to the guest
            guest.setKey(key);
            // we set on the key, that it is with a guest
            key.setWithGuest(true);
            // and we take it out of the array
            // make sure to -1 the space in the array again -> only the key we have given to the guest needs to be taken out of the keyrack
            keys[roomNumber-1] = null;
        } else {
            // if there is no ke where there should be one, we alert the police
            System.out.println("Missing key, alert police!");
        }
    }

    public void takeKeyBackFromGuest(Guest guest) {
        // first we get a key from the guest
        Key key = guest.getKey();

        // then we set the key back to not being with the guest anymore
        key.setWithGuest(false);
        // ... and put it pack in its spot in the keyrack
        keys[guest.getRoomNumber()-1] = key;
        // and finally take it away from the guest
        guest.setKey(null);
    }

    public void showKeyRack() {
        // We loop over the whole keyrack to show all the keys on the rack
        for (Key key : keys) {
            // don't forget, that the Objects that are shown via sout need to have a toString() so it shows something legible in the console
            System.out.println(key);
        }
        System.out.println("-----------------------");
    }

}
