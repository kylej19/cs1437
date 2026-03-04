import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

	// int x = 10;

	// if (x != 20)
	//     {
	// 	System.out.println("hello");
	//     }
	// else
	//     {
	// 	System.out.println("goodbye");
	//     }

	Scanner newScanner = new Scanner(System.in);
	
	// System.out.print("Enter day of the week: ");
	// String day = newScanner.next().toLowerCase();

	// switch (day)
	//     {
	//     case "monday":
	// 	System.out.println("happy monday!");
	// 	break;
	//     case "wednesday":
	// 	System.out.println("happy wednesday!");
	// 	break;
	//     case "friday":
	// 	System.out.println("happy friday!");
	//     default:
	// 	System.out.println("get some rest!");
	// 	break;
	//     }

	// switch (day)
	//     {
	//     case "monday"->System.out.println("happy monday");

	//     case "tuesday"->System.out.println("keep it up");

	//     case "sunday"->System.out.println("enjoy your weekend");

	//     default->System.out.println("invalid day");
	//     }

	// int age = 22;
	// boolean subscribed = true;
	// boolean hasTicket = false;

	// if (age > 16 && subscribed)
	//     {
	// 	if (!hasTicket)
	// 	    {
	// 		System.out.println("access granted.");
	// 	    }
	// 	else
	// 	    {
	// 		System.out.println("denied. certificated required");
	// 	    }
	//     }
	// else
	//     {
	// 	System.out.println("error. user must verify age and subscribe to view content");
	//     }

	int counter;

	System.out.print("enter any number: ");
	counter = newScanner.nextInt();

	while (counter > 0)
	    {
		System.out.print("_" + --counter + "\t");
	    }

	while (counter < 20)
	    {
		System.out.print("\t" + counter++ + "_");
	    }

	System.out.println();
	
    }
}
