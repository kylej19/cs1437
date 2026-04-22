public class Guest {
	private String name;
	private int roomNumber;
	private int days;

	public Guest(String name, int roomNumber, int days) {
		this.name = name;
		this.roomNumber = roomNumber;
		this.days = days;
	}

	public String getName() {
		return name;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public int getDays() {
		return days;
	}

	public String toString() {
		return "Guest: "+name+", Room: "+roomNumber+", Days: "+days;
	}

		
}
