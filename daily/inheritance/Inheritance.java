
// INHERITANCE

class House {
	int bedrooms = 4;
	String zip = "75056";
	double price = 1232321;
	public void hoa() {
		System.out.print("$100/month ");
	}
}

class NewHouse extends House {
	public void hoa() {
		System.out.print("$200/month ");
	}
}


public class Inheritance {
	public static void main(String[] args) {
		NewHouse h1 = new NewHouse();
		System.out.println(h1.price);
		h1.hoa();
	}
}
