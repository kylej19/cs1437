/* MoneyChanger.java
 * Provides the total change for a given an amount of money.
 * written by Kyle Johnson
 * openjdk 25.0.2 2026-01-20
 * OpenJDK Runtime Environment (build 25.0.2)
 * OpenJDK 64-Bit Server VM (build 25.0.2, mixed mode, sharing)
 */
import java.util.*;

public class MoneyChanger {
    public static void main(String[] args) {
	
	// get total pennies from the user
	Scanner newScanner = new Scanner(System.in);
	System.out.print("Enter total cents: ");
	int cents = newScanner.nextInt();

	int centsLeft;
	int dollars;
	int quarters;
	int dimes;
	int nickels;
	int pennies;

	dollars = cents / 100;
	centsLeft = cents % 100;
	quarters = centsLeft / 25;
	centsLeft = centsLeft % 25;
	dimes = centsLeft / 10;
	centsLeft = centsLeft % 10;
	nickels = centsLeft / 5;
	centsLeft = centsLeft % 5;
	pennies = centsLeft;

	System.out.println("Total cents: " + cents
			   + "\nDollars: " + dollars
			   + "\nQuarters: " + quarters
			   + "\nDimes: " + dimes
			   + "\nNickels: " + nickels
			   + "\nPennies: " + pennies);
    }
}
