// Quizzer.java
// quizes the user with simple addition equations
// written by Kyle Johnson

import java.util.*;
import java.text.DecimalFormat;

public class Quizzer {
    public static void main(String[] args) {

	// declare and initialize our instances of the objects
	Scanner kb = new Scanner(System.in);
	DecimalFormat percentageFormat = new DecimalFormat("00.0");

	// gather input for the total questions and declare the variabes we need
	System.out.printf("Enter the number of math equations you want to solve: ");
	int totalQuestions = kb.nextInt();

	// check for zero questions
	if (totalQuestions <= 0) {
	    System.out.println("User does not want to do math. Exiting.");
	    return;
	}
	
	int count = totalQuestions - 1;
	// these will be initialized later
	int totalCorrect;
	double percentageCorrect;

	// store our quiz operands within an array
	int[] op1 = new int[totalQuestions];
	int[] op2 = new int[totalQuestions];
	// initializes and declares the quiz problems
	while (count >= 0) {
	    op1[count] = (int)(Math.random() * 50);
	    op2[count] = (int)(Math.random() * 50);
	    count--;
	}

	// reset the total Correct before taking the quiz
	totalCorrect = 0;	
	do {
	    // the main quiz loop
	    for (int i = totalQuestions - 1; i >= 0; i--) {
		int result = op1[i] + op2[i];
		int userAnswer;

		System.out.printf("%d + %d = ", op1[i], op2[i]);
		userAnswer = kb.nextInt();
		if (userAnswer == result) {
		    System.out.println("Correct!");
		    totalCorrect++;
		} else System.out.println("Incorrect.");
	    }

	    // calculate the percentage correct and display
	    percentageCorrect =  100 * ((double) totalCorrect / (double) totalQuestions);
	    System.out.println("You got " + totalCorrect + " out of " + totalQuestions
			       + ", " + percentageFormat.format(percentageCorrect) + "%");

	    // let the user know if they passed or if the quiz will restart
	    if (percentageCorrect > 70.0) {
		System.out.println("You passed!");
	    } else {
		System.out.println("You failed. Try again!");
	    }
	} while (percentageCorrect < 70.0); // loop through the quiz until the user passes

	kb.close();
	    
    }
}
