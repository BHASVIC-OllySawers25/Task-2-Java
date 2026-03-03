import java.util.ArrayList;

public class Room {
	private int number;
	private int size;
	private ArrayList<Customer> occupants;
	private boolean clean;
	
    Room(int number, int size, boolean clean) {
        this.number = number;
        this.size = size;
        this.occupants = new ArrayList<Customer>();
        this.clean = clean;
    }
}