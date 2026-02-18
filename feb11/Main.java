/* Main.java
 * 2026-02-11
 * written by Kyle Johnson
 * openjdk 25.0.2 
 * OpenJDK Runtime Environment (build 25.0.2)
 * OpenJDK 64-Bit Server VM (build 25.0.2, mixed mode, sharing)
 */
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
	// int num = 10;
	// System.out.printf("Hello %d\n", num);

	// final String pinCode = "123$";
	// boolean authorizeUser = fals;
	// int counter = 10;
	// do {

	//     System.out.printf("Welcome to dashboard!\n");
	//     System.out.printf("Please enter your pin code: ");
	    
	//     
	//     String userPin = keyboard.nextLine();

	//     if (pinCode.equals(userPin)) {
	// 	authorizeUser = true;
	//     }

	//     System.out.printf("%d\n", counter);
	//     counter--;
	    
	// } while (authorizedUser);

	int[][] numbers = {
	    {10, 20, -100, -20, 50},
	    {30, 40, 60, 70, 80}
	};

	System.out.printf("numbers.length: %d\n", numbers.length);



	for (int i = 0; i < numbers.length; i++)
	    {
		System.out.printf("numbers[%d].length: %d\n", i, numbers[i].length);
		for (int j = 0; j < numbers[i].length; j++)
		    {
			System.out.printf("numbers[%d][%d]: %d\n", i, j, numbers[i][j]);
		    }
	    }


	// for (int i = 60; i > 0; --i)
	//     {
	// 	for (int j = 60; j > 0; --j)
	// 	    {
	// 		System.out.printf("%d%c", j, (j - 1) % 12 == 0 ? '\n' : ' ');
	// 	    }
	// 	System.out.println();
	//     }

	Scanner keyboard = new Scanner(System.in);

	System.out.printf("Enter in max stars: ");
	int stars = keyboard.nextInt();

	for (int i = 1; i <= stars; i++)
	    {
		for (int j = i; j <= stars; j++)
		    {
			System.out.printf("*%s", j % stars == 0 ? "\n" : "");
		    }
	    }

	

	System.out.println();
    }
}
