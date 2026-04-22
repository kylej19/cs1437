import java.util.*;

public class Main {
	public static void main(String[] args) {
		//C.R.U.D. APPLICATION
		//CREATE: GUESTS, ROOMS
		//READ: ROOMS, GUEST DETAILS
		//UPDATING: RESERVATIONS
		//DELETE: GUESTS AFTER CHECKOUT

		Scanner kb = new Scanner(System.in);
		HotelManagement mariott = new HotelManagement();

		mariott.makeNewReservation();
		mariott.showAvailableRooms();

		System.out.println("\nCHECKOUT");
		System.out.println("Enter room number: ");
		int roomNumber = kb.nextInt();
		mariott.checkoutGuest(roomNumber);
		mariott.showAvailableRooms();
	}
}
