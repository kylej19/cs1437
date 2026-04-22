import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		boolean goodEmail = false;
		while (!goodEmail) {
			System.out.print("Enter your email: ");
			String email = kb.nextLine().toLowerCase();
			// System.out.println(email);
			int lengthOfEmail = email.length();
			// System.out.println(emailLength);
			if (lengthOfEmail < 15 || lengthOfEmail > 25) {
				System.out.println("Error: email must be between 15 to 25 characters.");
			} else if (!email.contains("@") || !email.contains(".")) {
				System.out.println("Error: must have a valid domain.");
			} else if (!containsNumber(email)) {
				System.out.println("Error: must contain a number.");
			} else {
				System.out.println("Email is good!");
				goodEmail = true;
			}
		}
	}
	private static boolean containsNumber(String email) {
		for (int i = 0; i < email.length(); i++) {
			char c = email.charAt(i);
			if (Character.isDigit(c))
				return true;
		}
		return false;
	}
}
