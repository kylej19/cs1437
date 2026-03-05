/**
 * Kyle Johnson
 * 2026-03-05
 * openjdk 25.0.2 2026-01-20
 * OpenJDK Runtime Environment (build 25.0.2)
 * OpenJDK 64-Bit Server VM (build 25.0.2, mixed mode, sharing)
 * This program will calculate BMI with a functional method
 */

import java.util.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

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
    public static double calculateBMI(double height, double weight) {
        return (weight * 703)/(height * height);
    }
}
