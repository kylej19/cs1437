import java.util.*;

public class HotelManagement {

	Scanner kb = new Scanner(System.in);
	
	ArrayList<Room> allRooms = new ArrayList<>();
	ArrayList<Guest> allGuests = new ArrayList<>();
	int availableRooms = 0;

	// HotelRoom(String type, int number, boolean available, double price)
	public HotelManagement(){
		allRooms.add(new Room("King",101,true,1395.0));
		allRooms.add(new Room("2 Twins",102,false,495.0));
		allRooms.add(new Room("Full",103,true,595.0));
		allRooms.add(new Room("Queen",104,true,895.0));
		allRooms.add(new Room("Full",105,false,595.0));
	}


	public void showAvailableRooms() {
		availableRooms = 0;
		for (int i = 0; i < allRooms.size(); i++) {
				if(allRooms.get(i).getAvailable()) {
					availableRooms++;
					System.out.println(allRooms.get(i));
				}
			}
		if (availableRooms > 0) {
			System.out.println("We have "+availableRooms+" rooms available.");
		} else {
			System.out.println("No rooms available");
		}
	}

	public void makeNewReservation() {
		String name;
		int roomNumber, days;
		showAvailableRooms();
		
		System.out.println("Enter your name: ");
		name = kb.nextLine();
		System.out.println("Enter number of days: ");
		days = kb.nextInt();
		kb.nextLine();
		System.out.println("Choose room number from the list shown above: ");
		roomNumber = kb.nextInt();
		kb.nextLine();
		Guest newGuest = new Guest(name, roomNumber, days);
		allGuests.add(newGuest);
		Room reservedRoom = findRoom(roomNumber);
		if (reservedRoom != null) {
			reservedRoom.changeAvailability(false);
			System.out.println("Reservation complete!");
			System.out.println("Total cost = "+finalRoomCost(reservedRoom,newGuest)+" for "+days+" days. Enjoy your stay!");
		} else {
			System.out.println("Invalid number entered.");
		}
	}

	public Room findRoom(int roomNumber) {
		for (Room i: allRooms) {
			if (i.getRoomNumber() == roomNumber) {
				return i;
			}
		}
	return null;
	}
	public Guest findGuest(int roomNumber) {
		for (Guest i: allGuests) {
			if (i.getRoomNumber() == roomNumber) {
				return i;
			}
		}
		return null;
	}	

	public double finalRoomCost(Room r, Guest g) {
		return r.getPrice() * g.getDays();
	}

	public void checkoutGuest(int roomNumber) {
		Room r = findRoom(roomNumber);
		r.changeAvailability(true);
		allGuests.remove(findGuest(roomNumber));
	}
}
