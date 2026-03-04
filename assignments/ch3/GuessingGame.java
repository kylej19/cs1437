/* GuessingGame.java
 * the user must guess numbers and the computer gives hints
 * written by Kyle Johnson
 * COSC 1437-014
 * openjdk 25.0.2 2026-01-20
 * OpenJDK Runtime Environment (build 25.0.2)
 * OpenJDK 64-Bit Server VM (build 25.0.2, mixed mode, sharing)
 */

import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	int computerNumber = (int) (Math.random() * 100 + 1);
	int guessCount = 0;

	System.out.printf("Welcome to the Guessing Game!\n");
	System.out.printf("The system will pick a number between 1 and 100,\nyou get to guess which number, and the system will provide feedback.\n\nEnter your first guess:");

	int num = keyboard.nextInt();
	
	while (computerNumber != num)
	    {
		if (num > computerNumber)
		    System.out.printf("\nYour guess was too high! Guess again: ");
		if (num < computerNumber)
		    System.out.printf("\nYour guess was too low! Guess again: ");
		num = keyboard.nextInt();
		guessCount++;
	    }

	System.out.printf("%d was the correct number\n", computerNumber);
	System.out.printf("It took %d guesses\n", guessCount);	
    }
}
