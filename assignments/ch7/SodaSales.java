// author: kyle johnson
import java.util.*;

public class SodaSales {

    public static void main(String[] args) {

	int totalSodas = -1;
	Scanner kb = new Scanner(System.in);
	// objective 1: Ask the user how many soda types of soda they want to sell. Do NOT accept negative values for this number.
	while (totalSodas < 0) {
	    System.out.println("How many sodas are you selling?");
	    totalSodas = kb.nextInt();
	}
	kb.nextLine();
	if (totalSodas == 0) {
	    System.out.println("no soda");
	    return;
	}
	// objective 2: Use the number that the user entered to execute a loop to enter the names of the sodas into a name array.
	String sodaBrands[] = new String[totalSodas];
	int salesPerSoda[] = new int[totalSodas];

	for (int i = 0; i < totalSodas; i++) {

	    System.out.println("What is the name of soda " + (i + 1) + "?");
	    sodaBrands[i] = kb.nextLine();

	}
	kb.nextLine();
	// objective 3: Loop through the soda name array asking the user for the number of bottles sold for each type of soda. Do not accept negative values for the number of bottles sold. Store these numbers into an integer array.
	for (int i = 0; i < totalSodas; i++) {
	    int sodasSold = -1;
	    System.out.println("How many "+ sodaBrands[i] +" did you sell?");
	    while (sodasSold < 0) {

		sodasSold = kb.nextInt();

	    }
	    salesPerSoda[i] = sodasSold;
	}
	kb.nextLine();

	// objective 4: Display the total sales and the names of the highest selling and lowest selling sodas.
	for (int i = 0; i < totalSodas; i++) {

	    System.out.println(sodaBrands[i] + ": " + salesPerSoda[i] + "\n");

	}
    }

}
