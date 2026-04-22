


public class Room {
	private int number = 0;
	private boolean available = false;
	private double price = 0.0;
	public String type = null;

	public Room(String type, int number, boolean available, double price) {
		this.type = type;
		this.number = number;
		this.available = available;
		this.price = price;
	}

	public String getRoomType() {
		return type;
	}

	public double getPrice() {
		return price;
	}
	public boolean getAvailable() {
		return available;
	}
	public int getRoomNumber() {
		return number;
	}
	public String toString() {
		return "Room " + number + ", " + type + ". Price per Day: " + price + ". " + (available ? " Is available." : " Is not available.");
	}

	public void changeAvailability(boolean status) {
		available = status;
	}
}
