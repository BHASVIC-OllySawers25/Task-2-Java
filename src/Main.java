import java.util.ArrayList;

public class Main {

	public Main() {
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(new Room(1, 1, false));
		rooms.add(new Room(2, 2, true));
		rooms.add(new Room(3, 1, false));
		ArrayList<Hotel> myHotel = new ArrayList<Hotel>();
		Customer customer1 = new Customer(1, "Mrs. White");
		Customer customer2 = new Customer(2, "Mr. Green");
		Customer customer3 = new Customer(2, "Miss. Scarlett");
		Customer customer4 = new Customer(3, "Mrs. Peacock");
		Customer customer5 = new Customer(2, "Prof. Plum");
		Customer customer6 = new Customer(3, "Col. Mustard")  ;
		Receptionist myReceptionist = new Receptionist("Jane");
		Cleaner myCleaner = new Cleaner("Michael");
		Manager myManager = new Manager("Janhavi");

		myReceptionist.checkIn(myHotel, customer1);
		myReceptionist.checkIn(myHotel, customer2);
		myReceptionist.checkIn(myHotel, customer3);
		myReceptionist.checkOut(myHotel, customer1, myManager);

		myCleaner.cleanRooms(myHotel);

		myReceptionist.checkIn(myHotel, customer4);
		myReceptionist.checkOut(myHotel, customer4, myManager);
		myReceptionist.checkIn(myHotel, customer5);
		myReceptionist.checkOut(myHotel, customer5, myManager);
		myReceptionist.checkOut(myHotel, customer2, myManager);
		myReceptionist.checkOut(myHotel, customer3, myManager);

		myCleaner.cleanRooms(myHotel);

		myReceptionist.checkIn(myHotel, customer6);
		myReceptionist.checkOut(myHotel, customer6, myManager);
		Console.readLine();
    }

    public static void main(String[] args) {
        new Main();
    }
}