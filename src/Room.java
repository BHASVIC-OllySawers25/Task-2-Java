import java.util.ArrayList;

public class Room {
	private int number;
	private int size;
	public ArrayList<Customer> occupants;
	private boolean clean;
	
    Room(int number, int size, boolean clean) {
        this.number = number;
        this.size = size;
        this.occupants = new ArrayList<Customer>();
        this.clean = clean;
    }

    public void addOccupant(Room currentRoom, Customer occupantIn) {
        if (currentRoom.occupants.size() < currentRoom.size) {
            currentRoom.occupants.add(occupantIn);
            occupantIn.feedback++;
        }
        else {
            occupantIn.feedback--;
            return;
        }
        if (currentRoom.clean == true)
            occupantIn.feedback++;
        else
            occupantIn.feedback--;
        currentRoom.clean = false;
    }
    public void removeOccupant(Room currentRoom, Customer occupantOut) {
        int index = -1;
        for (int i = 0; i < currentRoom.occupants.size(); i++) {
            if (currentRoom.occupants.get(i).equals(occupantOut))
                index = i;
        }
        if (index != -1)
            currentRoom.occupants.remove(index);
    }





}