import java.util.ArrayList;

public class Cleaner {
	private String name;
	
    Cleaner(String name) {
        this.name = name;
    }

    void cleanRooms(Cleaner curCleaner, ArrayList<Room> hotel) {
        for (int i = 0; i < hotel.size(); i++) {
            if (hotel.get(i).occupants.isEmpty()) {
                hotel.get(i).clean = true;
                System.out.println(curCleaner.name + " cleaned Room " + hotel.get(i).number);
            }
        }
    }

}