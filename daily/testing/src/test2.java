import java.util.*;

public class test2
{
    public static void main(String[] args)
    {
	Scanner newScanner = new Scanner(System.in);

	System.out.println("Enter any number: ");
	int num = newScanner.nextInt();
	if ( num % 2 != 0)
	    {
		System.out.println("You entered the odd number " + num);
	    }
	else
	    {
		System.out.println("You entered the even number " + num);
	    }

	System.out.println("Enter item: ");
	String cart = newScanner.next();
	System.out.println("You entered the item " + cart);

	// Consume the newline left-over, also used to grab multi-word strings
	newScanner.nextLine(); 

	System.out.println("Enter price: ");
	double price = newScanner.nextDouble();
	System.out.println("You entered the price " + price);


	

	newScanner.close();
    }
}
