import java.util.Scanner;
import java.text.DecimalFormat;

public class Computer {

    private String vendor;
    private String device;
    private int year;
    private double price;

    // CONSTRUCTOR
    public Computer(String vendor, String device, int year, double price) {
	this.vendor = vendor;
	this.device = device;
	this.year = year;
	this.price = price;
    }

    // ACCESORS
    public String getVendor() {
	return vendor;
    }
    public String getDevice() {
	return device;
    }
    public int getYear() {
	return year;
    }
    public double getPrice() {
	return price;
    }

    public void printDesc() {
	DecimalFormat dollars = new DecimalFormat(",###.00");
	System.out.println("Produced by " + vendor + " in "
			   + year + ", the "
			   + device + " cost $"
			   + dollars.format(price) + " when it was released.");
    }

    // MUTATORS
    public void setVendor(String vendor) {
	this.vendor = vendor;
    }
    public void setDevice(String device) {
	this.device = device;
    }
    public void setYear(int year) {
	this.year = year;
    }
    public void setPrice(int price) {
	this.price = price;
    }
}
    

public class Main {
	public static void main(String[] args) {

	    Scanner kb = new Scanner(System.in);

	    Computer a = new Computer("Apple", "Macintosh", 1984, 2495.00);
	    Computer b = new Computer("IBM", "Personal Computer", 1981, 1565.00);

	    System.out.print("Enter in vendor name: ");
	    String vendorC = kb.nextLine();
	    System.out.print("Enter in device name: ");
	    String deviceC = kb.nextLine();
	    System.out.print("Enter in year released: ");
	    int yearC = kb.nextInt();
	    System.out.print("Enter in the price: ");
	    double priceC = kb.nextDouble();

	    Computer c = new Computer(vendorC, deviceC, yearC, priceC);

	    a.printDesc();
	    b.printDesc();
	    c.printDesc();

	    kb.close();
	    
	}
}
