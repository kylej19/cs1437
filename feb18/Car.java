import java.util.*;
import java.text.*;

public class Car {
    // methods: getPrice, displayMileage, showVIN, getYear
    public static void main(String[] args) {
	DecimalFormat currencyFormat = new DecimalFormat(",###.##");
	System.out.printf("the year of the car is %d\n", getYear());
	System.out.printf("Accident record: %s\n", hasAccidentRecord());
	displayMileage(100000);
	System.out.printf("the price of the car is $%s\n", currencyFormat.format(getPrice(120000)));
	
    }
    public static void displayMileage(int mileage) {
	DecimalFormat mileageFormat = new DecimalFormat(",###.##");
	System.out.printf("This car has %s miles\n", mileageFormat.format(mileage));
    }
    public static double getPrice(double price) {

	return (price * 0.065) + price;
    }
    public static int getYear() {
	Scanner kb = new Scanner(System.in);
	System.out.printf("Enter year of the car: ");
	int year = kb.nextInt();
	return year;
    }
    public static String getVIN() {
	Scanner kb = new Scanner(System.in);
	System.out.printf("Enter car VIN: ");
	String vin = kb.next();
	return vin;
    }
    public static boolean hasAccidentRecord() {
	if (getVIN().contains("s")) {
	    return true;
	}
	return false;
    }
}
