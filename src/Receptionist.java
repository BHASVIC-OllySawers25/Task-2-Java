import java.util.ArrayList;

public class Receptionist {
    private String name;



    Receptionist(String name) {
        this.name = name;
    }



    void checkIn(Receptionist curReceptionist, ArrayList<Room> hotel, Customer customer) {
        room.addOccupant(hotel.get(customer.roomBooking - 1), customer);
        System.out.println(curReceptionist.name + " checked in " + customer.name);
    }

    void checkOut(Receptionist curReceptionist, ArrayList<Room> hotel, Customer curCustomer, Manager curManager) {
        this.removeOccupant(hotel.get(curCustomer.roomBooking - 1), curCustomer);
        System.out.println(curReceptionist.name + " checked out " + curCustomer.name);
        curManager.takeFeedback(curManager, curCustomer);
    }
}