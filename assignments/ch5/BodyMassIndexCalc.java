import java.util.*;

public class BodyMassIndexCalc {
	public static void main (String[] args) {

		Scanner kb = new Scanner(System.in);
		String response;

		System.out.printf("Welcome to the BodyMassIndexCalc!\n");
		System.out.printf("Input your height (in): ");
		response = kb.nextLine();
		double heightImperial = Double.parseDouble(response);
		System.out.printf("Input your weight (lbs): ");
		response = kb.nextLine();
		double weightImperial = Double.parseDouble(response);



	}
}
