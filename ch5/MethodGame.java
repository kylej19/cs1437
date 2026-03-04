import java.util.*;

class MethodGame {
    static boolean switchPlanet(int num) {
	//prints random fact according to number entered
	switch (num) {
	case 1:
	    // Sun
	    // i had to use regular print for this one because the % 
	    System.out.print("The Sun contains about 99.8% of all the mass in the solar system.\n");
	    return true;

	case 2:
	    // Mercury
	    System.out.printf("Mercury has no atmosphere to trap heat, so its temperature is stable and cool.\n");
	    return false;

	case 3:
	    // Venus
	    System.out.printf("Venus rotates backwards compared to most planets.\n");
	    return true;

	case 4:
	    // Earth
	    System.out.printf("Earth is not the only known planet with liquid water on the surface.\n");
	    return false;

	case 5:
	    // Mars
	    System.out.printf("Mars has the largest volcano in the solar system: Olympus Mons.\n");
	    return true;

	case 6:
	    // Jupiter
	    System.out.printf("Jupiter’s Great Red Spot is a storm larger than Uranus.\n");
	    return false;

	case 7:
	    // Saturn
	    System.out.printf("Saturn’s rings are mostly made of ice and rock chunks.\n");
	    return true;

	case 8:
	    // Uranus
	    System.out.printf("Uranus rotates on its top at about a 177° tilt.\n");
	    return false;

	case 9:
	    // Neptune
	    System.out.printf("Neptune has the fastest recorded winds in the solar system — over 1,200 mph (≈1,930 km/h).\n");
	    return true;

	case 10:
	    // Pluto
	    System.out.printf("Pluto is in the Asteroid Belt, a region of icy objects between Mars and Jupiter.\n");
	    return false;

	default:
	    System.out.printf("%d is an invalid number!.\n", num);
	    return false;

	}
    }

    public static void main(String[] args) {

	Random rd = new Random();
	Scanner kb = new Scanner(System.in);
	boolean flag = true;
	System.out.printf("Welcome to the Planet quiz!\n");

	while(flag) {
	    System.out.print("True or false?\n");
	    // generate our random fact and save its truthiness to a variable
	    boolean answer = switchPlanet(rd.nextInt(10) + 1);
	    // for testing purposes
	    //boolean answer = switchPlanet(1);
	    String userGuess = kb.nextLine();
	    compare(userGuess, answer);

	    // ask the user if they want to play again, the default answer is capitalized as a hint
	    System.out.printf("Play again? (Y/n)");
	    // nextLine will grab all input, including a single newline '\n'
	    String playAgain = kb.nextLine();
	    // we only need to test for a no answer, flag is already true
	    if (playAgain.equalsIgnoreCase("n")) flag = false;
	}
    }

    static void compare(String guess, boolean answer) {
	// only correct if the user's input and the answer match, else it is wrong
	if ((guess.equalsIgnoreCase("true") && answer) || (guess.equalsIgnoreCase("false") && !answer)) {
	    System.out.printf("Correct!\n");
	} else {
	    System.out.printf("Incorrect.\n");
	}
    }
}
